package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class オプションリスト {

    @Getter
    private final List<オプション> value;

    public boolean 判定(Plan plan) {
        return value.stream().allMatch(v -> v.判定(plan));
    }
}
