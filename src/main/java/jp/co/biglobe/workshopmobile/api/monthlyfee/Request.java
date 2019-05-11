package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション.エンタメフリーオプション;
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
        g1 {
            @Override
            Plan getPlan() {
                return Plan._1ギガ;
            }
        }, // 1ギガ(スタート)
        g3 {
            @Override
            Plan getPlan() {
                return Plan._3ギガ;
            }
        }, // 3ギガ
        g30 {
            @Override
            Plan getPlan() {
                return Plan._30ギガ;
            }
        } // 30ギガ

;
        abstract Plan getPlan();
    }
}
