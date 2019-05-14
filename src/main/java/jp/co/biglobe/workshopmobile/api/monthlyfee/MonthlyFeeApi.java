package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション;
import jp.co.biglobe.workshopmobile.domain.月額料金;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class MonthlyFeeApi {

    @RequestMapping(value = "/monthly-fee", method = RequestMethod.GET)
    public Map invoke(
            Request request
    ) {
        Map<String, Object> res = new HashMap<>();

        Plan plan = request.convert();
        エンタメフリーオプション option = request.convert_option();

        if (plan.equals(Plan._1ギガ) && option.equals(エンタメフリーオプション.有)) {
            throw new RuntimeException("プランが1Gのときはエンタメフリーオプションはこうにゅうできません");
        }

        月額料金 price = Plan.sum(request.convert(), request.convert_option());

        res.put("monthly_fee", price.getValue() /* TODO 月額料金を返す */);

        return res;
    }



}
