package jp.co.biglobe.workshopmobile.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class エンタメフリーオプション {

    private final boolean value;

    public boolean getValue() {
        return value;
    }

    public エンタメオプションPrice getPrice() {
        return value ?
                new エンタメオプションPrice(1200) :
                new エンタメオプションPrice(0);
    }

}
