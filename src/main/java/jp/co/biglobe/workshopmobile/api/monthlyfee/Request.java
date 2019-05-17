package jp.co.biglobe.workshopmobile.api.monthlyfee;

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

    public Plan プラン取得() throws Exception {
        if (this.plan == PlanForm.g1) {
            return Plan._1ギガ;
        } else if (this.plan == PlanForm.g3) {
            return Plan._3ギガ;
        } else if(this.plan == PlanForm.g30) {
            return Plan._30ギガ;
        }
        throw new Exception("エラー");
    }

    enum PlanForm {
        g1, // 1ギガ(スタート)
        g3, // 3ギガ
        g30 // 30ギガ
    }
}
