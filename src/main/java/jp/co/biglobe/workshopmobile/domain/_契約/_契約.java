package jp.co.biglobe.workshopmobile.domain._契約;

import jp.co.biglobe.workshopmobile.domain.plan.PlanType;
import jp.co.biglobe.workshopmobile.domain._オプション._オプションタイプ;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class _契約 {
    private final PlanType planType;
    private final _オプションタイプ _オプションタイプ;
}
