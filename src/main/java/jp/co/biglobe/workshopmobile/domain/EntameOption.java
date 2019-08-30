package jp.co.biglobe.workshopmobile.domain;

import jp.co.biglobe.workshopmobile.domain.fee.オプション料金;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EntameOption {

    private final boolean value;

    public オプション料金 getPrice(Plan plan) {

        if (plan.isNotOption() && value) {
            throw new RuntimeException("だめです。");
        }
        return value ? new オプション料金(1200) : new オプション料金(0);
    }
}