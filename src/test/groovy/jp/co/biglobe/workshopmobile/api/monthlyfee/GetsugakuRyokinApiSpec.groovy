package jp.co.biglobe.workshopmobile.api.monthlyfee

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import spock.lang.Specification
import spock.lang.Unroll

import static jp.co.biglobe.workshopmobile.api.monthlyfee.GetsugakuRyokinApiSpec.ありなし.あり
import static jp.co.biglobe.workshopmobile.api.monthlyfee.GetsugakuRyokinApiSpec.ありなし.なし
import static jp.co.biglobe.workshopmobile.api.monthlyfee.Request.PlanForm.g1
import static jp.co.biglobe.workshopmobile.api.monthlyfee.Request.PlanForm.g3
import static jp.co.biglobe.workshopmobile.api.monthlyfee.Request.PlanForm.g30
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@Unroll
@WebMvcTest
class GetsugakuRyokinApiSpec extends Specification {
    @Autowired
    MockMvc mvc

    static final String apiPath = "/monthly-fee"

    def "1ギガプランでエンタメフリーありならエラー"() {
        setup:
        def builder = MockMvcRequestBuilders
                .get(apiPath)
                .param("plan", g1.name())
                .param("entame_free", あり.value)

        when:
        def result = mvc.perform(builder)

        then:
        result.andExpect(status().is4xxClientError())
    }

    def "プラン: #plan, エンタメフリー: #isEntmeFree の場合、月額料金は #monthlyFee"() {
        setup:
        def builder = MockMvcRequestBuilders
                .get(apiPath)
                .param("plan", plan.name())
                .param("entame_free", isEntmeFree.value)

        when:
        def result = mvc.perform(builder)

        then:
        result.andDo(MockMvcResultHandlers.print());
        result.andExpect(status().isOk())
        result.andExpect(jsonPath('$.monthly_fee').value(monthlyFee))

        where:

        plan | isEntmeFree || monthlyFee
        g1   | なし        || 1000
        g3   | なし        || 2000
        g30  | なし        || 6000

        g3   | あり        || 2000 + 1200
        g30  | あり        || 6000 + 1200

    }

    enum ありなし {
        あり("true"), なし("false")
        ありなし(String value) {
            this.value = value
        }
        private final String value
    }
}
