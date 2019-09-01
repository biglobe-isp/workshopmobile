package jp.co.biglobe.workshopmobile.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class オプション可否判定 {

    public static void valid(Plan plan, エンタメフリーオプション _エンタメフリーオプション) {

        if (plan.equals(Plan._1ギガ) && _エンタメフリーオプション.getValue()) {
            throw new RuntimeException("エンタメオプションは購入できません");
        }

    }

}
