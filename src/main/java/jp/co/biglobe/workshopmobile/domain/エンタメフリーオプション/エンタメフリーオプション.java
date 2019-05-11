package jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum エンタメフリーオプション {

    契約なし(new MonthlyFee(0)),
    契約あり(new MonthlyFee(1_200)),
    ;

    private final MonthlyFee value;

    public MonthlyFee 金額取得() {
        return value;
    }
}
