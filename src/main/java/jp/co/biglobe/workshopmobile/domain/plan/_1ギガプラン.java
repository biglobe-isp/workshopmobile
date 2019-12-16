package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.option.エンタメフリーオプション;

public class _1ギガプラン {

    /**
     * 1ギガプランではエンタメフリーは契約できません
     */
    public boolean 組み合わせ可否(
            エンタメフリーオプション _エンタメフリーオプション
    ) {
        // 1ギガかつエンタメフリーオプションあり
        if (_エンタメフリーオプション.equals(エンタメフリーオプション.あり)) {
            return false;
        }
        return true;
    }
}
