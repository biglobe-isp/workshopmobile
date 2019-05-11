package jp.co.biglobe.workshopmobile.domain;

import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション.エンタメフリーオプション;

import java.util.HashMap;
import java.util.Map;

public class プランオプション組み合わせ {

    static final Map<Plan, エンタメフリーオプション> 可能な組み合わせ = new HashMap<Plan, エンタメフリーオプション>() {{
        put(Plan._1ギガ, エンタメフリーオプション.契約なし);
        put(Plan._3ギガ, エンタメフリーオプション.契約なし);
        put(Plan._3ギガ, エンタメフリーオプション.契約あり);
        put(Plan._30ギガ, エンタメフリーオプション.契約なし);
        put(Plan._30ギガ, エンタメフリーオプション.契約あり);
    }};
}
