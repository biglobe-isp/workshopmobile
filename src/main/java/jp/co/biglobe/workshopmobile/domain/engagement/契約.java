package jp.co.biglobe.workshopmobile.domain.engagement;

import jp.co.biglobe.workshopmobile.domain.fee.オプション料金;
import jp.co.biglobe.workshopmobile.domain.fee.プラン料金;
import jp.co.biglobe.workshopmobile.domain.option.オプション;
import jp.co.biglobe.workshopmobile.domain.plan.プラン;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class 契約 {
    @Getter
    private final プラン plan;
    @Getter
    private final オプション option;
    public static boolean 申し込みできるか(プラン plan, オプション option) {
        if (option.equals(オプション.エンタメフリー)) {
            return !plan.equals(プラン._1ギガ);
        }
        return true;
    }

    public プラン料金 getプラン料金() {
        if(plan.equals(プラン._1ギガ)) {
            return プラン料金._1ギガ;
        }else if(plan.equals(プラン._3ギガ)) {
            return プラン料金._3ギガ;
        }else if(plan.equals(プラン._30ギガ)) {
            return プラン料金._30ギガ;
        }
        throw new RuntimeException("エラー");
    }

    public オプション料金 getオプション料金() {
        if(option.equals(オプション.エンタメフリー)) {
            return オプション料金.エンタメフリーあり;
        } else {
            return オプション料金.なし;
        }
    }
}
