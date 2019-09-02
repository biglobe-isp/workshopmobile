package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain._オプション._オプションタイプ;
import jp.co.biglobe.workshopmobile.domain.plan.PlanType;
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
    enum PlanForm {
        g1(PlanType._1ギガ), // 1ギガ(スタート)
        g3(PlanType._3ギガ), // 3ギガ
        g30(PlanType._30ギガ); // 30ギガ

        @Getter
        private PlanType planType;
    }

    public _オプションタイプ getオプション(){
        if(entame_free){
            return _オプションタイプ.エンタメ;
        }
        return _オプションタイプ._なし;
    }
}
