package jp.co.biglobe.workshopmobile.domain.option;

import jp.co.biglobe.workshopmobile.domain.fee.GetsugakuRyokin;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class EntameFree implements Option{
//    private final GetsugakuRyokin getsugakuRyokin;
    public GetsugakuRyokin getsugakuRyokin(){
        return new GetsugakuRyokin(1200);
    }


}
