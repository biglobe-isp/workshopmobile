package jp.co.biglobe.workshopmobile.domain.contract;

import jp.co.biglobe.workshopmobile.domain.fee.月額料金;
import jp.co.biglobe.workshopmobile.domain.option.EntameFree;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;

public class 契約 {
    private final Plan plan;
    private final EntameFree entameFree;

    public 契約(Plan plan, EntameFree entameFree) {
        if (plan == Plan._1ギガ && entameFree == EntameFree.あり) {
            throw new RuntimeException("1ギガはエンタメフリーオプションを付けることができません。");
        }

        this.plan = plan;
        this.entameFree = entameFree;
    }

    public 月額料金 月額料金を計算する() {
        return new 月額料金(plan.get料金().getValue() + entameFree.get料金().getValue());
    }
}
