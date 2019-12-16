package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.fee.プラン料金;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum プラン {
    _1ギガ(new プラン料金(1000)),
    _3ギガ(new プラン料金(2000)),
    _30ギガ(new プラン料金(6000));

    @Getter
    private final プラン料金 fee;
}
