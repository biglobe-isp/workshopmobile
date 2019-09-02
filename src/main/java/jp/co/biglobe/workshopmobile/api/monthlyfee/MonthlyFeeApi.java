package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.fee.GetsugakuRyokin;
import jp.co.biglobe.workshopmobile.domain.keisan.GetsugakuRyokinKeisan;
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
        GetsugakuRyokin getsugakuRyokin = GetsugakuRyokinKeisan.keisan(request.convertToPlan(),request.convertToEntameFree());
        res.put("monthly_fee", getsugakuRyokin.getValue() );
        return res;
    }



}
