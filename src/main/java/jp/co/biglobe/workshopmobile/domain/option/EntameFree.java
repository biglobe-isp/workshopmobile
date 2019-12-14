package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.fee.料金;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum EntameFree {
    あり(new 料金(1200)),
    なし(new 料金(0));

    @Getter
    private final 料金 料金;
}
