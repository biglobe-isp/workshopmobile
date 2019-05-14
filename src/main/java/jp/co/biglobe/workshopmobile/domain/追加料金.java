package jp.co.biglobe.workshopmobile.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@AllArgsConstructor
public enum 追加料金 {

    _0円(エンタメフリーオプション.無, 0),
    _1200円(エンタメフリーオプション.有, 1200);

    @Getter
    private エンタメフリーオプション option;

    @Getter
    private final int price;

    public static int 料金を計算する(エンタメフリーオプション _option) {
        return Stream.of(追加料金.values())
                .filter(v -> v.getOption().equals(_option))
                .map(v -> v.getPrice())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("追加料金が見つかりません"));
    }

}
