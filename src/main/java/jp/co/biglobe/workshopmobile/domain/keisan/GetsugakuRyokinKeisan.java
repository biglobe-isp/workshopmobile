package jp.co.biglobe.workshopmobile.domain.keisan;

import jp.co.biglobe.workshopmobile.domain.fee.GetsugakuRyokin;
import jp.co.biglobe.workshopmobile.domain.option.EntameFree;
import jp.co.biglobe.workshopmobile.domain.option.Option;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;

import java.util.Optional;

public class GetsugakuRyokinKeisan {
    public static GetsugakuRyokin keisan(Plan plan, Optional<EntameFree> option){
        if(option.isPresent()) {
            return plan.getGetsugakuRyokin().add(option.get().getsugakuRyokin());
        }
        return plan.getGetsugakuRyokin();
    }
}
