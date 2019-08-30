package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.Contract;
import jp.co.biglobe.workshopmobile.domain.fee.料金;
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
        料金 price = Contract.cluc(request.getPlan().getPlan(), request.convert());

        Map<String, Object> res = new HashMap<>();
        res.put("monthly_fee", price.getValue()  /* TODO 月額料金を返す */);

        return res;
    }



}
