package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum エンタメフリーオプション {
    なし(new MonthlyFee(0)),
    あり(new MonthlyFee(1200));

    @Getter
    private final MonthlyFee monthlyFee;
}
