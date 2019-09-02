package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain._オプション._オプションタイプ;
import jp.co.biglobe.workshopmobile.domain._購入可否._購入可否;
import jp.co.biglobe.workshopmobile.domain.plan.PlanType;
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
        PlanType planType = request.getPlan().getPlanType();
        _オプションタイプ _エンタメ = request.getオプション();
        boolean _購入可否 = new _購入可否()._購入可否(planType, _エンタメ);
        if(_購入可否){
//        _契約 契約 = new _契約(planType,_オプションタイプ);
            res.put("monthly_fee", request.getPlan().getPlanType().getMonthlyFee().getValue() /* TODO 月額料金を返す */);
            return res;
        }
        throw new RuntimeException();
    }


}
