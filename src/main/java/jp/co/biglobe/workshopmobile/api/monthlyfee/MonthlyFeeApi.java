package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.option.EntertainmentFreeOption;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import jp.co.biglobe.workshopmobile.service.PlanAndOptionService;
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
        Plan plan;
        switch (request.getPlan()) {
            case g1:
                plan = Plan._1ギガ;
                break;

            case g3:
                plan = Plan._3ギガ;
                break;

            case g30:
                plan = Plan._30ギガ;
                break;

            default:
                throw new RuntimeException();
        }

        EntertainmentFreeOption option = request.isEntame_free() ? EntertainmentFreeOption.あり : EntertainmentFreeOption.なし;

        new PlanAndOptionService().check(plan, option);

        Map<String, Object> res = new HashMap<>();
        res.put("monthly_fee", new PlanAndOptionService().calculation(plan, option).getValue());
        return res;
    }


}
