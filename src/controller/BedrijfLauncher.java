package controller;

import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.Zzper;

import java.util.Scanner;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class BedrijfLauncher {
    public static void main(String[] args) {

        Afdeling [] afdelingen = new Afdeling[4];
        String[] afdelingSoort = new String[] {"Uitvoering","Support", "Management", "Documentatie"};
        String[] afdelingLocatie = new String[] {"Hilversum", "Amsterdam", "Almere", "Gouda"};

        for (int teller = 0; teller < afdelingen.length; teller++) {
            afdelingen[teller] = new Afdeling(afdelingSoort[teller], afdelingLocatie[teller]);
        }

        Werknemer baas = new Werknemer("Mark", "Den Haag", afdelingen[2], 10000);
        Werknemer medewerker = new Werknemer("Caroline", "Delft", afdelingen[1], 4000);
        Zzper assistent = new Zzper("Klaas", "Diemen", 50.00, afdelingen[3]);
        Zzper projectmanager = new Zzper("Ronald", "Amsterdam", 80, afdelingen[0]);
        assistent.huurIn(160);
        projectmanager.huurIn(320);

        Persoon[] personen =  new Persoon[4];
        personen[0] = baas;
        personen[1] = medewerker;
        personen[2] = assistent;
        personen[3] = projectmanager;

        for (int teller = 0; teller < personen.length; teller++) {
        toonJaarinkomen(personen[teller]);}

    }
    public static void toonJaarinkomen(Persoon persoon){
        System.out.printf("%s verdient %.2f per jaar.\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }
}
