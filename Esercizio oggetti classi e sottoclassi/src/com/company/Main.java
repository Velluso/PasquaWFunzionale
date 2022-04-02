package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        String codiceFisc;



        Studenti Marco = new Studenti("Marco", "Velluso", "VLLMRC02M29L219Z", "4ATUR", "8");
        Studenti Mercedes = new Studenti("Mercedes", "Bautista", "DFJLNSDCLNCLANLAN", "5ATUR", "9");
        Studenti Raisa = new Studenti("Raisa", "Pedruzzi", "SJFNHOSFHASJPADADP", "5BTUR", "8");

          /*  Marco.nome = "Marco";
            Marco.cognome = "Velluso";
            Marco.codiceFiscale = "VLLMRC02M29L219Z";
            Marco.mediaVoti = "8";
            Marco.classe = "4ATUR";

           */
            Marco.studia();
            Marco.seguonoLaLezione();
            Marco.CodFisc();
            Marco.vaInClasse();
            Marco.voti();









    }
}
