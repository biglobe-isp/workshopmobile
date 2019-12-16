package jp.co.biglobe.workshopmobile.domain.fee;

/**
 * 月額料金
 */
public class MonthlyFee {
    private final int value;

    public MonthlyFee(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public MonthlyFee plus(MonthlyFee monthlyFee) {
        return new MonthlyFee(this.value + monthlyFee.value);
    }
}
