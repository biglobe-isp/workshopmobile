package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.kounyu.Mitsumori;
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
        Mitsumori mitsumori = new Mitsumori(request.convertPlan(),request.convertEntameFree());
        
        Map<String, Object> res = new HashMap<>();
        res.put("monthly_fee",  mitsumori.calcurate().getValue());
        return res;
    }



}
