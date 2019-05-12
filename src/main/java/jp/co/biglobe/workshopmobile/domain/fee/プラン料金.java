package jp.co.biglobe.workshopmobile.domain.fee;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum プラン料金 {
    _1ギガ(new 料金(1000)),
    _3ギガ(new 料金(2000)),
    _30ギガ(new 料金(6000)),
    ;

    @Getter
    private final 料金 fee;
}
