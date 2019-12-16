package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.option.エンタメフリーオプション;
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
    private final プラン料金 _プラン料金;

    public boolean 組み合わせ可否(
            エンタメフリーオプション _エンタメフリーオプション
    ) {
        // 1ギガかつエンタメフリーオプションあり
        if (this.equals(_1ギガ) && _エンタメフリーオプション.equals(エンタメフリーオプション.あり)) {
            return false;
        }
        return true;
    }

}
