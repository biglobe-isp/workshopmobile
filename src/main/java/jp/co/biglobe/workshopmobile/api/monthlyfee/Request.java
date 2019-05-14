package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション;
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

    public Plan convert() {
        if (plan.name().equals("g1")) {
            return Plan._1ギガ;
        } else if (plan.name().equals("g3")) {
            return Plan._3ギガ;
        } else {
            return Plan._30ギガ;
        }
    }

    public エンタメフリーオプション convert_option() {
        return entame_free ? エンタメフリーオプション.有 : エンタメフリーオプション.無;
    }

}
