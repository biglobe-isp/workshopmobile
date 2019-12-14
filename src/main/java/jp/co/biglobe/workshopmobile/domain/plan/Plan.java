package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.オプション;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

/**
 * プラン
 */
@AllArgsConstructor
public enum Plan {
    _1ギガ(new MonthlyFee(1000),エンタメフリーオプション可否.つけられない()),
    _3ギガ(new MonthlyFee(2000),エンタメフリーオプション可否.つけられる()),
    _30ギガ(new MonthlyFee(6000),エンタメフリーオプション可否.つけられる());

    @Getter
    private final MonthlyFee monthlyFee;
    private final エンタメフリーオプション可否 entame;

    public void 整合性チェック(Optional<オプション> オプションOptional){
        if(オプションOptional.isPresent() && !entame.isValue()) {
            throw new RuntimeException("つけられないプランです。");
        }

    }
}
