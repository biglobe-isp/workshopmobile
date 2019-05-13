package jp.co.biglobe.workshopmobile.domain.option;


import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EntameFree {
    private final boolean value;

    public MonthlyFee keisan() {
        if (value == true) {
            return new MonthlyFee(1200);
        }
        return new MonthlyFee(0);
    }

    public boolean isKounyuable(Plan plan){
        if(plan == Plan._1ギガ){
            return false;
        }
        return true;
    }
}
