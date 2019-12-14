package jp.co.biglobe.workshopmobile.api.monthlyfee;

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
        res.put("monthly_fee",
                request.convertToPlan().get料金().getValue()
                        + request.convertToEntameFree().get料金().getValue());

        return res;
    }


}
