package jp.co.biglobe.workshopmobile.domain.order;

import jp.co.biglobe.workshopmobile.domain.option.オプションリスト;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.Getter;

public class 申込 {

    @Getter
    private final Plan plan;

    @Getter
    private final オプションリスト _オプションリスト;

    public 申込(Plan plan, オプションリスト _オプションリスト) {
        if (!isValid(plan, _オプションリスト)) {
            throw new RuntimeException("申込不可");
        }

        this.plan = plan;
        this._オプションリスト = _オプションリスト;
    }

    private boolean isValid(Plan plan, オプションリスト _オプションリスト) {
        return _オプションリスト.判定(plan);
    }
}
