package jp.co.biglobe.workshopmobile.service;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.option.EntertainmentFreeOption;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;

public class PlanAndOptionService {
    public MonthlyFee calculation(Plan plan, EntertainmentFreeOption option) {
        return plan.getMonthlyFee().add(option.getOptionFee());
    }

    public void check(Plan plan, EntertainmentFreeOption option) {
        if (plan == Plan._1ギガ && option.isあり()) {
            throw new RuntimeException();
        }
    }

}
