package jp.co.biglobe.workshopmobile.domain.fee;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 月額料金
 */
@AllArgsConstructor
public class MonthlyFee {
    @Getter
    private final int value;

    public MonthlyFee 足す(MonthlyFee other) {
        return new MonthlyFee(value + other.value);
    }
}
