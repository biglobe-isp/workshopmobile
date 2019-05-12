package jp.co.biglobe.workshopmobile.domain.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.engagement.契約;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 月額料金
 */
@AllArgsConstructor
public class 月額料金 {
    @Getter
    private final int value;

    public static 月額料金 計算する(契約 engagement) {



        return new 月額料金(engagement.getプラン料金().getFee().getValue() + engagement.getオプション料金().getFee().getValue());
    }
}
