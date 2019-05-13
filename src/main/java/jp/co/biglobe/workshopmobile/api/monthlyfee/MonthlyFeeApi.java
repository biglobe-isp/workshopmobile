package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.option.EntameFreeOption;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
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


        int fee = 0;
        if(request.isEntame_free()) {

            EntameFreeOption entameFreeOption = new EntameFreeOption();
            Plan plan = request.toPlan();
            if(!entameFreeOption.購入判断(request.toPlan())){
                throw new RuntimeException();
            }
            fee = entameFreeOption.getMonthlyFee().getValue();

        }

        if (request.getPlan().equals(Request.PlanForm.g1)) {
            res.put("monthly_fee", Plan._1ギガ.getMonthlyFee().getValue() + fee);
        } else if (request.getPlan().equals(Request.PlanForm.g3)) {
            res.put("monthly_fee", Plan._3ギガ.getMonthlyFee().getValue() + fee);
        } else if (request.getPlan().equals(Request.PlanForm.g30)) {
            res.put("monthly_fee", Plan._30ギガ.getMonthlyFee().getValue() + fee);
        }
        return res;
    }


}
