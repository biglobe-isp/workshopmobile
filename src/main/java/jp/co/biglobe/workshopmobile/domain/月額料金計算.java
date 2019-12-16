package jp.co.biglobe.workshopmobile.domain;

import jp.co.biglobe.workshopmobile.domain.fee.オプション料金;
import jp.co.biglobe.workshopmobile.domain.fee.プラン料金;
import jp.co.biglobe.workshopmobile.domain.fee.月額料金;
import lombok.AllArgsConstructor;

/**
 * 月額料金
 */
@AllArgsConstructor
public class 月額料金計算 {

    public static 月額料金 計算(プラン料金 plan, オプション料金 option){
        return  new 月額料金(plan.getValue() + option.getValue());
    }
}
