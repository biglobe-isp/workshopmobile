package jp.co.biglobe.workshopmobile.domain.エンタメフリーオプション;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.契約.契約;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
public class エンタメフリーオプション {

    final boolean 契約有無;

    public MonthlyFee 金額取得() {
        return 契約有無 ? new MonthlyFee(1_200) : new MonthlyFee(0);
    }
}
