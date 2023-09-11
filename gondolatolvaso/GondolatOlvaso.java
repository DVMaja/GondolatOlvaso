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
            for (int ertek = 0; ertek < ertekek.length-1; ertek++) {
                
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
            if (szamlalo % 3 == 0) {
                System.out.println("");
                System.out.print(pakli[szamlalo]);
            } else {
                System.out.print(pakli[szamlalo]);
            }

        }

        return pakli;
    }

    private static void Melyik() {
        System.out.println("");
        System.out.println("Kérem adja meg melyik oszlopot választja");
        Scanner sc = new Scanner(System.in);
    }

    private static void Kever() {
        //késöbb
    }

    private static boolean EzVolt() {
        boolean ezVolt = false;
        return ezVolt;
    }

}
