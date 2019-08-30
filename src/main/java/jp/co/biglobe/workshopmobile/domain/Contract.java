package jp.co.biglobe.workshopmobile.domain;

import jp.co.biglobe.workshopmobile.domain.fee.オプション料金;
import jp.co.biglobe.workshopmobile.domain.fee.基本料金;
import jp.co.biglobe.workshopmobile.domain.fee.料金;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Contract {

    public static 料金 cluc(Plan plan, EntameOption entameOption) {

        基本料金 monthlyfee = plan.getPrice();
        オプション料金 optionfee = entameOption.getPrice(plan);

        return new 料金(monthlyfee.getValue() + optionfee.getValue());
    }

}
