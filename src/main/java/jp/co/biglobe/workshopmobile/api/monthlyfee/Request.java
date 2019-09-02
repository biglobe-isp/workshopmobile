package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.option.EntameFree;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

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

    public Plan convertToPlan(){
        switch(plan){
            case g1: return Plan._1ギガ;
            case g3: return Plan._3ギガ;
            case g30: return Plan._30ギガ;
        }
        throw new RuntimeException();
    }

    public Optional<EntameFree> convertToEntameFree(){
        if(entame_free){
            return Optional.of(new EntameFree());
        }
        return Optional.empty();
    }


}
