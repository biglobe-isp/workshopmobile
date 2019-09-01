package jp.co.biglobe.workshopmobile.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class 料金計算 {

    private final Plan plan;

    private final エンタメフリーオプション _エンタメフリーオプション;

    public Amount getAmount() {

        return plan.強制エンタメ() ?
                new Amount(plan.getPrice().getValue()) :
                new Amount(plan.getPrice().getValue() + _エンタメフリーオプション.getPrice().getValue());
    }

    public void valid() {
        if (plan.エンタメ不可() && _エンタメフリーオプション.getValue()) {
            throw new RuntimeException("エンタメオプションは購入できません");
        }
    }


}
