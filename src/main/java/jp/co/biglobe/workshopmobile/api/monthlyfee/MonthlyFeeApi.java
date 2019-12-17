package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.fee.SIM契約;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション;
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
        Request.PlanForm planForm = request.getPlan();
        boolean entameFree = request.isEntame_free();

        Plan plan = null;
        switch (planForm) {
            case g1:
                plan = Plan._1ギガ;
                break;
            case g3:
                plan = Plan._3ギガ;
                break;
            case g30:
                plan = Plan._30ギガ;
                break;
        }

        エンタメフリーオプション entameFreeOption = new エンタメフリーオプション(entameFree);
        SIM契約 monthlyFee = new SIM契約(plan, entameFreeOption);

        Map<String, Object> res = new HashMap<>();
        res.put("monthly_fee", monthlyFee.計上する().getValue()/* TODO 月額料金を返す */);
        return res;
    }



}
