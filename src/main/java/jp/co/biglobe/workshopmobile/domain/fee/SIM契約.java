package jp.co.biglobe.workshopmobile.domain.fee;

import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション;
import jp.co.biglobe.workshopmobile.domain.組み合わせチェック;
import lombok.Getter;

/**
 * なんだこれ？
 */
public class SIM契約 {
    @Getter
    private final Plan plan;

    @Getter
    private final エンタメフリーオプション entameFreeOption;

    public SIM契約(Plan plan, エンタメフリーオプション entameFreeOption) {
        this.plan = plan;
        this.entameFreeOption = entameFreeOption;

        if (!組み合わせチェック.validate(this.plan, this.entameFreeOption)) {
            throw new RuntimeException();
        }
    }


    public 月額料金 計上する() {
        return new 月額料金(plan.getPlanFee().getValue() + entameFreeOption.getOptionFee().getValue());
    }


}
