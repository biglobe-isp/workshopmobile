package jp.co.biglobe.workshopmobile.domain.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class エンタメフリーオプション可否 {
    @Getter
    private final boolean value;

    public static エンタメフリーオプション可否 つけられる(){
        return new エンタメフリーオプション可否(true);
    }

    public static エンタメフリーオプション可否 つけられない(){
        return new エンタメフリーオプション可否(false);
    }

}
