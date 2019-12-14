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

    public static MonthlyFee zero(){
        return new MonthlyFee(0);
    }

    public MonthlyFee add(MonthlyFee monthlyFee){
        return new MonthlyFee(value + monthlyFee.value);
    }
}
