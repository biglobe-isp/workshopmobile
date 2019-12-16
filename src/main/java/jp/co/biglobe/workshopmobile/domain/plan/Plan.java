package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;

/**
 * プラン
 */
public enum Plan {
    _1ギガ(new MonthlyFee(1000)),
    _3ギガ(new MonthlyFee(2000)),
    _30ギガ(new MonthlyFee(6000));

    private final MonthlyFee monthlyFee;

    public MonthlyFee getMonthlyFee() {
        return monthlyFee;
    }

    Plan(MonthlyFee monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
