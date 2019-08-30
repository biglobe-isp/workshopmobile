package jp.co.biglobe.workshopmobile.domain;

import jp.co.biglobe.workshopmobile.domain.fee.基本料金;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum Plan {
    _1ギガ(new 基本料金(1000), false),
    _3ギガ(new 基本料金(2000), true),
    _30ギガ(new 基本料金(6000), true);

    @Getter
    private final 基本料金 monthlyFee;

    private final boolean option;

    public 基本料金 getPrice() {
        return new 基本料金(monthlyFee.getValue());
    }

    public boolean isNotOption() {
        return !option;
    }

}
