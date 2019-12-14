package jp.co.biglobe.workshopmobile.domain.fee;

import jp.co.biglobe.workshopmobile.domain.option.オプション;
import jp.co.biglobe.workshopmobile.domain.option.オプションリスト;
import jp.co.biglobe.workshopmobile.domain.order.申込;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class 月額合計料金 {
    @Getter
    private final int value;

    public static 月額合計料金 create(申込 _申込) {
        Plan plan = _申込.getPlan();
        オプションリスト _オプションリスト = _申込.get_オプションリスト();

        List<MonthlyFee> オプション合計料金List = _オプションリスト.getValue().stream().map(オプション::get月額料金).collect(Collectors.toList());
        int オプション合計料金 = 0;
        for (MonthlyFee monthlyFee : オプション合計料金List) {
            オプション合計料金 += monthlyFee.getValue();
        }

        return new 月額合計料金(plan.getMonthlyFee().getValue() + オプション合計料金);
    }
}
