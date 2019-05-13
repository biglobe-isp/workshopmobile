package jp.co.biglobe.workshopmobile.domain.kounyu;

import jp.co.biglobe.workshopmobile.domain.fee.ShiharaiSougaku;
import jp.co.biglobe.workshopmobile.domain.option.EntameFree;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mitsumori {
    private final Plan plan;

    private final EntameFree entameFree;

    public ShiharaiSougaku calcurate(){
        return new ShiharaiSougaku(plan.getMonthlyFee().getValue() + entameFree.keisan().getValue());
    }

    public boolean isKounyable(){
        return entameFree.isKounyuable(plan);
    }

}
