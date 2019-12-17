package jp.co.biglobe.workshopmobile.domain;

import jp.co.biglobe.workshopmobile.domain.plan.Plan;

public class 組み合わせチェック {
    public static boolean validate(Plan plan, エンタメフリーオプション option) {
        return !(plan == Plan._1ギガ && option.is加入してるか());
    }

}
