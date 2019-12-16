package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.plan.プラン;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Request {
    // プラン
    private PlanForm plan;

    // 動画・音楽楽しみ放題　エンタメフリー・オプション
    private boolean entame_free;

    @AllArgsConstructor
    @Getter
    enum PlanForm {
        g1(プラン._1ギガ), // 1ギガ(スタート)
        g3(プラン._3ギガ), // 3ギガ
        g30(プラン._30ギガ); // 30ギガ

        private プラン plan;

    }
}
