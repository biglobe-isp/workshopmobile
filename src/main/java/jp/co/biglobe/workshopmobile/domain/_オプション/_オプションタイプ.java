package jp.co.biglobe.workshopmobile.domain._オプション;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum _オプションタイプ {
    _なし(new _オプション料金(0)),
    エンタメ(new _オプション料金(1200));

    private final _オプション料金 _オプション料金;
}
