package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import jp.co.biglobe.workshopmobile.domain.オプション.エンタメフリーオプション;
import jp.co.biglobe.workshopmobile.domain.申し込み.申し込み;
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
    ) throws Exception {
        Map<String, Object> res = new HashMap<>();
        Plan plan = request.プラン取得();
        申し込み 申し込み = new 申し込み(plan);

        if(request.isEntame_free()){
            申し込み.オプション追加(new エンタメフリーオプション());
        }

        res.put("monthly_fee", 申し込み.料金を取得する().getValue() /* TODO 月額料金を返す */);
        return res;
    }



}
