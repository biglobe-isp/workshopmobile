package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.option.EntameFree;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Request {
    // プラン
    private PlanForm plan;

    // 動画・音楽楽しみ放題　エンタメフリー・オプション
    private boolean entame_free;

    enum PlanForm {
        g1, // 1ギガ(スタート)
        g3, // 3ギガ
        g30 // 30ギガ
    }

    public Plan convertToPlan() {
        if (plan == Request.PlanForm.g1) {
            return Plan._1ギガ;
        } else if (plan == Request.PlanForm.g3) {
            return Plan._3ギガ;
        } else {
            return Plan._30ギガ;
        }
    }

    public EntameFree convertToEntameFree() {
        return entame_free ? EntameFree.あり : EntameFree.なし;
    }
}
