package jp.co.biglobe.workshopmobile.domain.fee;

import jp.co.biglobe.workshopmobile.api.monthlyfee.Request;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum オプション料金 {
    エンタメフリーあり(new 料金(1200)) {
        public boolean エンタメチェック(Request.PlanForm planForm) {
            return !planForm.equals(Request.PlanForm.g1);
        }
    },
    なし(new 料金(0)) {
        public boolean エンタメチェック(Request.PlanForm planForm) {
            return true;
        }
    },
    ;

    @Getter
    private final 料金 fee;

    abstract public boolean エンタメチェック(Request.PlanForm planForm);
}
