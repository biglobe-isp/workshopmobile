package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.option.エンタメフリーオプション;
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

    public Plan getPlan() {
        switch (plan) {
            case g1:
                return Plan._1ギガ;
            case g3:
                return Plan._3ギガ;
            case g30:
                return Plan._30ギガ;
            default:
                throw new RuntimeException("failed");
        }
    }

    public エンタメフリーオプション getEntameFree() {
        return entame_free ? エンタメフリーオプション.あり : エンタメフリーオプション.なし;
    }
}
