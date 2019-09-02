package jp.co.biglobe.workshopmobile.domain._購入可否;

import jp.co.biglobe.workshopmobile.domain._オプション._オプションタイプ;
import jp.co.biglobe.workshopmobile.domain.plan.PlanType;

public class _購入可否 {
    public boolean _購入可否(PlanType planType, _オプションタイプ _オプション){
        if(_オプション == _オプションタイプ._なし){
            return true;
        }
        if(planType == PlanType._1ギガ){
            return false;
        }
        return true;
    }
}
