package application.MobiliDaEsterno;

import application.FabbricaMobili;
import application.Mobili.Divano;
import application.Mobili.Sedia;
import application.Mobili.Tavolo;

public class FabbricaMobiliDaEsterno implements FabbricaMobili {
    public Sedia creaSedia() {
        return new SediaDaGiardino();
    }

    public Tavolo creaTavolo() {
        return new TavoloDaTerazza();
    }

    public Divano creaDivano() {
        return new DivanoLoungeDaEsterno();
    }
}
