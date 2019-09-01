package jp.co.biglobe.workshopmobile.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum Plan {
    _1ギガ(new MonthlyFee(1000), false, false),
    _3ギガ(new MonthlyFee(2000), false, true),
    _30ギガ(new MonthlyFee(6000), false, true),
    _50ギガ(new MonthlyFee(10000), true, true);

    @Getter
    private final MonthlyFee monthlyFee;

    private final boolean _強制エンタメ;

    private final boolean _エンタメ購入可;


    public PlanPrice getPrice() {
        return new PlanPrice(monthlyFee.getValue());
    }

    public boolean 強制エンタメ() {
        return _強制エンタメ;
    }

    public boolean エンタメ不可() {
        return !_エンタメ購入可;
    }

}
