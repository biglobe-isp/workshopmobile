package jp.co.biglobe.workshopmobile.domain.plan;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * 月額料金
 */
@AllArgsConstructor
@EqualsAndHashCode
public class MonthlyFee {
    @Getter
    private final int value;
}
