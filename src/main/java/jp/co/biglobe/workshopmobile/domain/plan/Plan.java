package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.fee.基本料金;
import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション;
import jp.co.biglobe.workshopmobile.domain.月額料金;
import jp.co.biglobe.workshopmobile.domain.追加料金;
import lombok.AllArgsConstructor;

/**
 * プラン
 */
@AllArgsConstructor
public enum Plan {
    _1ギガ,
    _3ギガ,
    _30ギガ;

    public static 月額料金 sum(Plan plan, エンタメフリーオプション option) {
        return new 月額料金(基本料金.料金を計算する(plan) + 追加料金.料金を計算する(option));
    }

}
