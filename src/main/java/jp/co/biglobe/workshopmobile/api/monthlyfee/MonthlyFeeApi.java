package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.fee.月額料金;
import jp.co.biglobe.workshopmobile.domain.option.オプション;
import jp.co.biglobe.workshopmobile.domain.plan.プラン;
import jp.co.biglobe.workshopmobile.domain.月額料金計算;
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

        プラン plan = request.getPlan().getPlan();
        オプション option = オプション.create(plan, request.isEntame_free());

        月額料金 monthly_fee = 月額料金計算.計算(plan.getFee(), option.getFee());

        Map<String, Object> res = new HashMap<>();
        res.put("monthly_fee", monthly_fee.getValue() /* TODO 月額料金を返す */);
        return res;
    }



}
