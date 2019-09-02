package jp.co.biglobe.workshopmobile.domain.fee;

import jp.co.biglobe.workshopmobile.domain.option.Option;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 月額料金
 */
@AllArgsConstructor
public class GetsugakuRyokin {
    @Getter
    private final int value;

//    public GetsugakuRyokin calculate(Plan plan, Option option){
//        return new GetsugakuRyokin();
//    }

    public GetsugakuRyokin add(GetsugakuRyokin getsugakuRyokin){
        return new GetsugakuRyokin(this.value + getsugakuRyokin.getValue());
    }

}
