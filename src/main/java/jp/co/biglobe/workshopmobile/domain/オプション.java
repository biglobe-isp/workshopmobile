package jp.co.biglobe.workshopmobile.domain;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum オプション {
    _エンタメフリー(new MonthlyFee(1200));

    @Getter
    private final MonthlyFee monthlyFee;
}
