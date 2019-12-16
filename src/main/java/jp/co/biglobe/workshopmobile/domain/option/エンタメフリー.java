package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.fee.月額料金;
import jp.co.biglobe.workshopmobile.domain.plan.プラン;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * プラン
 */
@AllArgsConstructor
public enum エンタメフリー {
    あり(new 月額料金(1200), new ArrayList<プラン>(){{add(プラン._3ギガ);add(プラン._30ギガ);}}),
    なし(new 月額料金(0), new ArrayList<プラン>(){{add(プラン._1ギガ);}});

    @Getter
    private final 月額料金 monthly;

    @Getter
    private final List<プラン> planList;



}
