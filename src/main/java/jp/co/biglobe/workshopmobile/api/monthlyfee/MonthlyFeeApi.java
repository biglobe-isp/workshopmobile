package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.fee.月額料金;
import jp.co.biglobe.workshopmobile.domain.option.エンタメフリーオプション;
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

        プラン _プラン = request.getPlanForm().getPlanObject();
        エンタメフリーオプション _エンタメフリーオプション = request.getエンタメフリーオプション();

        月額料金 _月額料金 = new 月額料金(_プラン, _エンタメフリーオプション);

        Map<String, Object> res = new HashMap<>();
        res.put("monthly_fee", _月額料金.get月額料金());
        return res;
    }



}
