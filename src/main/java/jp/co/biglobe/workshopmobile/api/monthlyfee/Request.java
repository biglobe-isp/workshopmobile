package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.option.エンタメフリーオプション;
import jp.co.biglobe.workshopmobile.domain.plan.プラン;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Request {
    // プラン
    private PlanForm plan;

    public PlanForm getPlanForm() {
        return plan;
    }

    // 動画・音楽楽しみ放題　エンタメフリー・オプション
    private boolean entame_free;

    public エンタメフリーオプション getエンタメフリーオプション() {
        if (entame_free) {
            return エンタメフリーオプション.あり;
        }
        return エンタメフリーオプション.なし;
    }

    enum PlanForm {
        g1, // 1ギガ(スタート)
        g3, // 3ギガ
        g30 // 30ギガ
        ;

        public プラン getPlanObject() {
            if (this.equals(g1)) {
                return プラン._1ギガ;
            }
            if (this.equals(g3)) {
                return プラン._3ギガ;
            }
            if (this.equals(g30)) {
                return プラン._30ギガ;
            }
            throw new RuntimeException("提供していないプランです");
        }
    }
}
