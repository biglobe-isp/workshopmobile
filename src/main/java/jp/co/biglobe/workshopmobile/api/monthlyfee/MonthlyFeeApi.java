package jp.co.biglobe.workshopmobile.api.monthlyfee;

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
        if (request.getPlan() == Request.PlanForm.g1) {
            res.put("monthly_fee", Plan._1ギガ.getMonthlyFee().getValue());
        } else if (request.getPlan() == Request.PlanForm.g3) {
            res.put("monthly_fee", Plan._3ギガ.getMonthlyFee().getValue());
        } else {
            res.put("monthly_fee", Plan._30ギガ.getMonthlyFee().getValue());
        }
        return res;
    }



}
