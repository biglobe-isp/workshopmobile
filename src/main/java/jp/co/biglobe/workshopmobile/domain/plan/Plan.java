package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.fee.GetsugakuRyokin;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum Plan {
    _1ギガ(new GetsugakuRyokin(1000)),
    _3ギガ(new GetsugakuRyokin(2000)),
    _30ギガ(new GetsugakuRyokin(6000));

    @Getter
    private final GetsugakuRyokin getsugakuRyokin;

}
