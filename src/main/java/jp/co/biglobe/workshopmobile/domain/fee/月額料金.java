package jp.co.biglobe.workshopmobile.domain.fee;

import jp.co.biglobe.workshopmobile.domain.option.エンタメフリーオプション;
import jp.co.biglobe.workshopmobile.domain.plan.プラン;

/**
 * 月額料金
 */
public class 月額料金 {
    private final プラン _プラン;
    private final エンタメフリーオプション _エンタメフリーオプション;

    public 月額料金(プラン _プラン, エンタメフリーオプション _エンタメフリーオプション) {
        this._プラン = _プラン;
        this._エンタメフリーオプション = _エンタメフリーオプション;

        if (!_プラン.組み合わせ可否(_エンタメフリーオプション)) {
            throw new RuntimeException("提供していないサービスの組み合わせです");
        }
    }

    public int get月額料金() {
        return _プラン.get_プラン料金().getValue() + _エンタメフリーオプション.get_エンタメフリーオプション料金().getValue();
    }

}
