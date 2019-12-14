package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.fee.月額合計料金;
import jp.co.biglobe.workshopmobile.domain.option.エンタメフリーオプション;
import jp.co.biglobe.workshopmobile.domain.option.オプションリスト;
import jp.co.biglobe.workshopmobile.domain.order.申込;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
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
        オプションリスト _オプションリスト = request.isEntame_free() ? new オプションリスト(Arrays.asList(new エンタメフリーオプション())) : new オプションリスト(new ArrayList<>());
        申込 _申込 = new 申込(request.getPlan(), _オプションリスト);
        res.put("monthly_fee", 月額合計料金.create(_申込).getValue());
        return res;
    }
}
