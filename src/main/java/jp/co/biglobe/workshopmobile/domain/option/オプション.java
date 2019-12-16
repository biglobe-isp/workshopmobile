package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.fee.オプション料金;
import jp.co.biglobe.workshopmobile.domain.fee.無効プランリスト;
import jp.co.biglobe.workshopmobile.domain.plan.プラン;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum オプション {
    エンタメフリー(new オプション料金(1200), 無効プランリスト.エンタメフリー),
    通話フリー(new オプション料金(500), 無効プランリスト.通話フリー),
    オプション無し(new オプション料金(0), 無効プランリスト.無し);

    @Getter
    private final オプション料金 fee;

    @Getter
    private final 無効プランリスト planList;


    public static オプション create(プラン plan, boolean isEntameFree){
        if(isEntameFree){
            if(エンタメフリー.invalid(plan)){
                throw new RuntimeException("");
            }
            return エンタメフリー;
        }else{
            return オプション無し;
        }
    }

    public boolean invalid(プラン plan){
        return planList.getValue().contains(plan);
    }
}
