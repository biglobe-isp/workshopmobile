package jp.co.biglobe.workshopmobile.domain.option;


import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * エンタメフリーオプション
 */
@AllArgsConstructor
public enum EntertainmentFreeOption {
    あり(new MonthlyFee(1200)),
    なし(new MonthlyFee(0));

    @Getter
    private final MonthlyFee optionFee;

    public boolean isあり() {
        return this.equals(あり);
    }

}
