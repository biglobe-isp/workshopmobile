package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;

public interface オプション {

    MonthlyFee get月額料金();

    boolean 判定(Plan plan);
}
