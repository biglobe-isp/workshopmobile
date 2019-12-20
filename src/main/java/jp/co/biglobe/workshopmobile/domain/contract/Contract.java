package jp.co.biglobe.workshopmobile.domain.contract;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.option.エンタメフリーオプション;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;

public class Contract {
    private final Plan plan;
    private final エンタメフリーオプション entameFree;

    public Contract(Plan plan, エンタメフリーオプション entameFree) {
        if (plan == Plan._1ギガ && entameFree == エンタメフリーオプション.あり) {
            throw new RuntimeException("failed");
        }
        this.plan = plan;
        this.entameFree = entameFree;
    }

    public MonthlyFee calculateMonthlyFee() {
        return plan.getMonthlyFee().plus(entameFree.getMonthlyFee());
    }
}
