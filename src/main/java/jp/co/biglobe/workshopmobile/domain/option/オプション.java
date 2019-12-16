package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import java.util.Arrays;
import java.util.List;

public enum オプション {
    エンタメフリーオプション(new MonthlyFee(1200), Arrays.asList(Plan._3ギガ, Plan._30ギガ));

    private final MonthlyFee monthlyFee;
    private final List<Plan> plans;

    public MonthlyFee getMonthlyFee() {
        return monthlyFee;
    }

    オプション(MonthlyFee monthlyFee, List<Plan> plans) {
        this.monthlyFee = monthlyFee;
        this.plans = plans;
    }

    public boolean is適用可能(Plan plan) {
        return this.plans.contains(plan);
    }
}
