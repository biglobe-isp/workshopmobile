package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum Plan {
    _1ギガ(new MonthlyFee(1000)),
    _3ギガ(new MonthlyFee(2000)),
    _30ギガ(new MonthlyFee(6000));


    @Getter
    private final MonthlyFee monthlyFee;
}
