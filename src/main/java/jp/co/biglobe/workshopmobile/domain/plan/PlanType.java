package jp.co.biglobe.workshopmobile.domain.plan;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum PlanType {
    _1ギガ(new MonthlyFee(1000)),
    _3ギガ(new MonthlyFee(2000)),
    _30ギガ(new MonthlyFee(6000));

    @Getter
    private final MonthlyFee monthlyFee;
}
