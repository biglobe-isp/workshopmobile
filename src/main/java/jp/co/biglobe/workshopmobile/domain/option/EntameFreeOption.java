package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;

public class EntameFreeOption {

    public boolean 購入判断(Plan plan) {

        if (plan.equals(Plan._1ギガ)) {
            return false;
        }
        return true;
    }

    public MonthlyFee getMonthlyFee() {
        return new MonthlyFee(1200);
    }
}
