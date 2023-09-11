package gondolatolvaso;

import java.util.Scanner;

public class GondolatOlvaso {

    public static void main(String[] args) {
        Kirak();
        Melyik();
        Kever();
        EzVolt();
    }

    private static String[] Kirak() {
        String[] pakli = new String[21];
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int index = 0;
        for (int szin = 0; szin < szinek.length; szin++) {
            for (int ertek = 0; ertek < ertekek.length - 1; ertek++) {
                pakli[index] = szinek[szin] + "_" + ertekek[ertek] + " ";
                index += 1;
            }
        }

//        int index1 = 1;
//        for (String szin : szinek) {
//            for (int i = 0; i < szinek; i++) {
//                
//            }
//        }
        for (int szamlalo = 0; szamlalo < pakli.length; szamlalo++) {
            String lap = pakli[szamlalo];
            if (szamlalo % 3 == 0) {
                System.out.println("");
                System.out.printf("%-8s", lap);
            } else {
                System.out.printf("%-8s", lap);
            }
        }
        return pakli;
    }

    private static void Melyik() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        
        boolean jo;
        do {
            System.out.println("Kérem adja meg melyik oszlopot választja(1-3): ");
            int oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);

    }

    private static void Kever() {
        //késöbb
    }

    private static boolean EzVolt() {
        boolean ezVolt = false;
        return ezVolt;
    }

//    private static void Megjelenit() {
//        for (int szamlalo = 0; szamlalo < pakli.length; szamlalo++) {
//            if (szamlalo % 3 == 0) {
//                System.out.println("");
//                System.out.print(pakli[szamlalo]);
//            } else {
//                System.out.print(pakli[szamlalo]);
//            }
//        }
//    }
}
