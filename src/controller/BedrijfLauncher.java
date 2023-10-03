package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
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

//        Werknemer baas = new Werknemer("Mark", "Den Haag", afdelingen[2], 10000);
//        Werknemer medewerker = new Werknemer("Caroline", "Delft", afdelingen[1], 4000);
//        Zzper assistent = new Zzper("Klaas", "Diemen", 50.00, afdelingen[3]);
//        Zzper projectmanager = new Zzper("Ronald", "Amsterdam", 80, afdelingen[0]);

        ArrayList <Persoon> personen = new ArrayList<>();

//        personen.add(new Werknemer("Mark", "Den Haag", afdelingen[2], 10000));
//        personen.add(new Werknemer("Angelique", "Rotterdam", afdelingen[2], 5000));
//        personen.add(new Werknemer("Caroline", "Delft", afdelingen[1], 4000));
//        personen.add(new Zzper("Klaas", "Diemen",50.00,  afdelingen[3]));
//        personen.add(new Zzper("Ronald", "Zaandam", 80, afdelingen[0]));
//        personen.add(new Zzper("Jannie", "Utrecht", 60, afdelingen[0]));
//        personen.add(new Zzper("Anne", "Zwolle", 40.00, afdelingen[0]));
//
//        personen.add(new Vrijwilliger("Ambi", "Amsterdam", afdelingen[0]));
//        personen.add(new Vrijwilliger("Naledi", "Gaborone", afdelingen[1]));
//        personen.add(new Vrijwilliger("Ceren", "Istanboel", afdelingen[2]));
//        personen.add(new Vrijwilliger("Haining", "Shaoxing", afdelingen[3]));

        Scanner scanner = new Scanner(System.in);
        Werknemer nieuwsteWerknemer = new Werknemer();
        System.out.print("Geef de naam: ");
        nieuwsteWerknemer.setNaam(scanner.next());
        System.out.println();
        System.out.print("Geef de woonplaats: ");
        nieuwsteWerknemer.setWoonplaats(scanner.next());
        System.out.println();
        Afdeling itAfdeling = new Afdeling();
        System.out.print("Geef de naam van de afdeling: ");
        itAfdeling.setAfdelingNaam(scanner.next());
        System.out.println();
        System.out.print("Geef de plaats van de afdeling: ");
        itAfdeling.setAfdelingPlaats(scanner.next());
        nieuwsteWerknemer.setAfdeling(itAfdeling);
        System.out.println();
        System.out.print("Geef het maandsalaris: ");
        nieuwsteWerknemer.setMaandsalaris(scanner.nextDouble());
        System.out.println();

        System.out.print(nieuwsteWerknemer);
        toonJaarinkomen(nieuwsteWerknemer);



//        for (int teller = 0; teller < personen.size(); teller++) {
//            if (personen.get(teller) instanceof Zzper){
//                ((Zzper) personen.get(teller)).huurIn(320);
//            }
//        }

//        for (int teller = 0; teller < personen.size(); teller++) {
//            if (personen.get(teller) instanceof Vrijwilliger){
//                ((Vrijwilliger) personen.get(teller)).huurIn(160);
//            }
//        }

//        Collections.sort(personen);
//        for (Persoon persoon : personen) {// enhanced for loop
//            System.out.println();
//            System.out.println(persoon.toString());
//            toonJaarinkomen(persoon);
//        }


    }
    public static void toonJaarinkomen(Persoon persoon){

        System.out.printf("%s verdient %.2f per jaar.\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }
}
