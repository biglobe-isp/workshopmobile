package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション.エンタメフリーオプション;
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
        Request.PlanForm plan = request.getPlan();
        boolean entame_free = request.isEntame_free();

        Map<String, Object> res = new HashMap<>();
        res.put("monthly_fee", plan.getPlan().getMonthlyFee().getValue() + new エンタメフリーオプション(entame_free).金額取得().getValue());
        return res;
    }


}
