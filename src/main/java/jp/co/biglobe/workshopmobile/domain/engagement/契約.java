package jp.co.biglobe.workshopmobile.domain.engagement;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.option.オプション;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;

import java.util.Optional;

public class 契約 {
    final Plan plan;
    final Optional<オプション> option;

    public 契約(Plan plan, オプション option) {
        if (!is契約可能(plan, option)) {
            throw new IllegalArgumentException(option + "は" + plan + "では購入できません。");
        }
        this.plan = plan;
        this.option = Optional.of(option);
    }

    public 契約(Plan plan) {
        this.plan = plan;
        this.option = Optional.empty();
    }

    private static boolean is契約可能(Plan plan, オプション option) {
        return option.is適用可能(plan);
    }

    public MonthlyFee monthlyFee() {
        if (option.isPresent()) {
            return plan.getMonthlyFee().plus(option.get().getMonthlyFee());
        }
        return plan.getMonthlyFee();
    }
}
