package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.Amount;
import jp.co.biglobe.workshopmobile.domain.Plan;
import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション;
import jp.co.biglobe.workshopmobile.domain.料金計算;
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

        // controll
        Plan plan = request.getPlan().getPlan();
        エンタメフリーオプション _エンタメフリーオプション = request.getエンタメフリーオプション();


        料金計算 _料金計算 = new 料金計算(plan, _エンタメフリーオプション);
        _料金計算.valid();

        Amount amount = _料金計算.getAmount();

        // controll
        Map<String, Object> res = new HashMap<>();
        res.put("monthly_fee", amount.getValue() /* TODO 月額料金を返す */);
        return res;
    }



}
