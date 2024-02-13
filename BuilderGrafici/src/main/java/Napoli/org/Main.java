package Napoli.org;


import Napoli.org.Builders.BarChartBuilder;
import Napoli.org.Builders.Builder;
import Napoli.org.Builders.PieChartBuilder;
import Napoli.org.Builders.StackedBarBuilder;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        int input=0;
        String keyValue, key, title;
        double value;
        Builder builder = null;  //non so il tipo di grafo che vuole l'utente
        System.out.println("Inserisci il titolo del grafico: ");
        title=scanner.nextLine();

        while(input<1 || input>3) {
            System.out.println("Scegli il tipo di grafico da creare: \n" +
                    "1: Grafico a barre \n" +
                    "2: grafico a torta \n" +
                    "3: Grafico a barra sovrapposta ");

            input = scanner.nextInt();
        }
        builder = switch (input) {
            case 1 -> new BarChartBuilder(title);
            case 2 -> new PieChartBuilder(title);
            case 3 -> new StackedBarBuilder(title);
            default -> builder;
        };
        while(input!=-1){
            System.out.println("1: inserisci una chiave valore\n" +
                    "-1: mostra il grafo");

            input=scanner.nextInt();
            switch (input){
                case 1:{
                    System.out.println("Inserisci una coppia chiave:valore");
                    keyValue=scanner.next();
                    key=keyValue.split(":")[0];
                    value= Double.parseDouble(keyValue.split(":")[1]);
                    builder.addData(key, value);
                    break;
                }
                case -1:JFrame frame=builder.getChart();   //Prendo il risultato dal builder
                break;
            }
        }












    }
}