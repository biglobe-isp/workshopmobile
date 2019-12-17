package jp.co.biglobe.workshopmobile.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class エンタメフリーオプション {
    @Getter
    private final boolean 加入してるか;

    public オプション料金 getOptionFee() {
        if (this.加入してるか) {
            return new オプション料金(1200);
        } else {
            return new オプション料金(0);
        }

    }
}
