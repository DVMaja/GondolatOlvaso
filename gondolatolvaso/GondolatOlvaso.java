package gondolatolvaso;

import java.util.Scanner;

public class GondolatOlvaso {

    public static void main(String[] args) {
        Kirak();
        Melyik();
        Kever();
        EzVolt();

    }

    private static int[] Kirak() {
        int[] tomb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        for (int szamlalo = 0; szamlalo < tomb.length; szamlalo++) {

            if (szamlalo % 3 == 0) {
                System.out.println("");
                System.out.print(tomb[szamlalo] + " ");
            } else {
                System.out.print(tomb[szamlalo] + " ");
            }

        }
        return tomb;
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
