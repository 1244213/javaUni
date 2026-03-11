/*Esercizio 1
Es. 1) Definire 3 variabili baseMinore, baseMaggiore
e altezza di tipo int, e inizializzarle con valori letti da
tastiera. Definire e stampare una variabile area di tipo
double contenente l’area del trapezio corrispondente:
(baseMinore+baseMaggiore)*altezza/2
Suggerimento: usare il metodo nextInt per leggere
gli interi. Attenzione alle promozioni implicite!*/

import java.util.Scanner;

public class es1{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        int baseMinore, baseMaggiore, altezza;
        double area;

        System.out.print("Inserisci Base minore: ");
        baseMinore = scan.nextInt();

        System.out.print("Inserisci Base maggiore: ");
        baseMaggiore = scan.nextInt();

        System.out.print("Inserisci altezza: ");
        altezza = scan.nextInt();

        area = (baseMinore + baseMaggiore) * altezza / 2;

        System.out.println("Area trapezio = " + area);  

    }

}