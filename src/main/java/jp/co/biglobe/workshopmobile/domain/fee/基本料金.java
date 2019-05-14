package jp.co.biglobe.workshopmobile.domain.fee;

import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * 月額料金
 */
@AllArgsConstructor
public enum 基本料金 {

    _1000(Plan._1ギガ, 1000),
    _2000(Plan._3ギガ, 2000),
    _6000(Plan._30ギガ, 6000);

    @Getter
    private final Plan plan;

    @Getter
    private final int price;

    public static int 料金を計算する(Plan _plan) {
        return Stream.of(基本料金.values())
                .filter(v -> v.getPlan().equals(_plan))
                .map(v -> v.getPrice())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("プラン料金が見つかりません"));
    }
}
