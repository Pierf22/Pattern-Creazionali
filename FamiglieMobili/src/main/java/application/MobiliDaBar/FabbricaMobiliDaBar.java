package application.MobiliDaBar;

import application.FabbricaMobili;
import application.Mobili.Divano;
import application.Mobili.Sedia;
import application.Mobili.Tavolo;

public class FabbricaMobiliDaBar implements FabbricaMobili {
    public Sedia creaSedia() {
        return new SgabelloDaBar();
    }

    public Tavolo creaTavolo() {
        return new BanconeBar();
    }

    public Divano creaDivano() {
        return new BanquetteDaBar();
    }
}
