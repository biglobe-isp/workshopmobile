package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.engagement.契約;
import jp.co.biglobe.workshopmobile.domain.monthlyfee.月額料金;
import jp.co.biglobe.workshopmobile.domain.option.オプション;
import jp.co.biglobe.workshopmobile.domain.plan.プラン;
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
        プラン plan = null;

        if(request.getPlan().equals(Request.PlanForm.g1)) {
            plan = プラン._1ギガ;
        }else if(request.getPlan().equals(Request.PlanForm.g3)) {
            plan = プラン._3ギガ;
        }else if(request.getPlan().equals(Request.PlanForm.g30)) {
            plan = プラン._30ギガ;
        } else {
            throw new RuntimeException("エラー");
        }

        オプション option = request.isEntame_free() ? オプション.エンタメフリー : オプション.なし;

        if(!契約.申し込みできるか(plan, option)) {
            throw new RuntimeException("エラー");
        }

        契約 engagement = new 契約(plan, option);
        月額料金 monthlyFee = 月額料金.計算する(engagement);

        Map<String, Object> res = new HashMap<>();
        res.put("monthly_fee", monthlyFee.getValue());
        return res;
    }



}
