[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=12748687&assignment_repo_type=AssignmentRepo)

Ho completato i seguenti esercizi che ho comitato nel main

# 1. BuilderGrafici 
utilizza il Builder \
In Questo esercizio vengono creati dei grafici con il pattern Builder \
Viene preso in input da console:\

* il nome del grafo
* Il tipo di grafo da creare
* Un insieme di chiave:valore\
con builder.getChart() viene costruito il grafico corrispodente ai dati inseriti

# 2. ComputerFactory
   utilizza la fabbrica astratta ed il Prototype\
  In questo esercizio ho utilizzo il pattern Prototype con l'Abstract Factory\
E' una fabbrica di computer \
Grazie al pattern prototype posso modificare\
i componenti da inserire nei computer a tempo di esecuzione.

I computer hanno:
* CPU che può essere AMD o Intel
* GPU che può essere integrata o Nvidia
* RAM Samsung\

Per ogni computer vengono stampati i componenti, il prezzo di ognuno ed il prezzo finale

  
  # 3. Stampatore figure
Ho utilizzato il Metodo fabbrica con il Singleton Abbiamo un creatore astratto (CreateItems) Il costruttore astratto è una classe singleton con la lazy initialization Abbiamo tre creatori concreti (CreateBlackBalls, CreateBlueRectangles, CreateGreenTriangles) Abbiamo un prodotto astratto (Item) Abbiamo tre prodotti concreti(BlackBalls, BlueRectangles, GreenTriangles).
Ad ogni click del mouse viene generato un oggetto. E' possibile cambiare l'oggetto stampato modificando l'instance del creatore astratto\
# 4. Famiglie Mobili
In questo esercizio ho utilizato la fabbrica astratta con \
* Due famiglie : Mobili da bar e Mobili da terrazzo
* Una fabbrica astratta : fabbricaMobili
* Due fabbriche concrete : fabbricaMobiliDaBar e fabbricaMobiliDaEsterno
* I prodotti sono Sedie, Tavoli e Divani, con i rispettivi concreti per le due famiglie
