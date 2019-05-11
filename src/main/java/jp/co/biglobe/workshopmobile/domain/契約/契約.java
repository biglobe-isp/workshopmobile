package jp.co.biglobe.workshopmobile.domain.契約;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション.エンタメフリーオプション;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class 契約 {

    final Plan プラン;

    final エンタメフリーオプション エンタメフリーオプション;

    public static 契約 of(Plan プラン, エンタメフリーオプション エンタメフリーオプション) {
        if (エンタメフリーオプション == エンタメフリーオプション.契約あり && プラン == Plan._1ギガ) {
            throw new RuntimeException();
        }
        return new 契約(プラン, エンタメフリーオプション);
    }

    public MonthlyFee 合算料金を取得する() {
        return プラン.getMonthlyFee().足す(エンタメフリーオプション.金額取得());
    }
}
