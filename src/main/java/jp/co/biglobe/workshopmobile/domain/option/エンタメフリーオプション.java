package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class エンタメフリーオプション implements オプション {

    @Override
    public MonthlyFee get月額料金() {
        return new MonthlyFee(1200);
    }

    @Override
    public boolean 判定(Plan plan) {
        return !plan.equals(Plan._1ギガ);
    }
}
