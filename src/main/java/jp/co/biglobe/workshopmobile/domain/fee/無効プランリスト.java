package jp.co.biglobe.workshopmobile.domain.fee;

import jp.co.biglobe.workshopmobile.domain.plan.プラン;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 月額料金
 */
@AllArgsConstructor
@Getter
public enum 無効プランリスト {
    エンタメフリー(new ArrayList<プラン>(){{add(プラン._1ギガ);}}),
    通話フリー(new ArrayList<プラン>(){{add(プラン._30ギガ);}}),
    無し(new ArrayList());

    private final List value;
}
