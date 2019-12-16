package jp.co.biglobe.workshopmobile.domain.option;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum  エンタメフリーオプション {
    あり(new エンタメフリーオプション料金(1200)),
    なし(new エンタメフリーオプション料金(0));
    @Getter
    private final エンタメフリーオプション料金 _エンタメフリーオプション料金;
}
