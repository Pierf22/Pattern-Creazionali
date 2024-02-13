package application;

import application.Mobili.Divano;
import application.Mobili.Sedia;
import application.Mobili.Tavolo;
import application.MobiliDaBar.FabbricaMobiliDaBar;
import application.MobiliDaEsterno.FabbricaMobiliDaEsterno;


public class Main {
    public static void main(String[] args) {
        //Utilizzo della fabbrica mobili da Bar
        System.out.println(RED+ "Utilizzo della fabbrica mobili da bar"+RESET);
        FabbricaMobili fabbricaMobili =new FabbricaMobiliDaBar();
        Sedia sedia=fabbricaMobili.creaSedia();
        Tavolo tavolo=fabbricaMobili.creaTavolo();
        Divano divano=fabbricaMobili.creaDivano();

        sedia.siediti();
        tavolo.miPoggio();
        divano.miRilasso();

        //Utilizzo della fabbrica mobili da Esterno
        System.out.println(BLUE+ "Utilizzo della fabbrica mobili da esterno"+RESET);
        fabbricaMobili =new FabbricaMobiliDaEsterno();
        sedia=fabbricaMobili.creaSedia();
        tavolo=fabbricaMobili.creaTavolo();
        divano=fabbricaMobili.creaDivano();

        sedia.siediti();
        tavolo.miPoggio();
        divano.miRilasso();

    }

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
}