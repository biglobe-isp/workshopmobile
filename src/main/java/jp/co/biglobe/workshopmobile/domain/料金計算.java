package jp.co.biglobe.workshopmobile.domain;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class 料金計算 {
    private final Plan plan;
    private final Optional<オプション> あるかもしれないオプション;

    public MonthlyFee 実行する(){
        // エンタメ可否
        plan.整合性チェック(あるかもしれないオプション);
        // 計算
        return plan.getMonthlyFee().add(
                あるかもしれないオプション
                        .map(オプション::getMonthlyFee).orElse(MonthlyFee.zero())
        );
    }
}
