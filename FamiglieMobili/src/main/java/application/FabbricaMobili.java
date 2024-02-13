package application;

import application.Mobili.Divano;
import application.Mobili.Sedia;
import application.Mobili.Tavolo;

public interface FabbricaMobili {
    Sedia creaSedia();
    Tavolo creaTavolo();
    Divano creaDivano();
}
