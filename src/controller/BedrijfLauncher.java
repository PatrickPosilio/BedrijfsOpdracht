package controller;

import database.AfdelingDAO;
import database.DBaccess;
import database.WerknemerDAO;
import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class BedrijfLauncher {
    public static void main(String[] args) {

        DBaccess dBaccess = new DBaccess("Bedrijf", "userBedrijf", "userBedrijfPW");
        dBaccess.openConnection();
        AfdelingDAO afdelingDAO = new AfdelingDAO(dBaccess);
        //afdelingDAO.slaAfdelingOp(new Afdeling("HR", "Hilversum"));

        ArrayList<Afdeling> afdelingLijst = afdelingDAO.geefAfdelingen();

        Werknemer nieuwpersoon = new Werknemer("Lodewijk", "Zaandam", afdelingLijst.get(17), 2500);
        System.out.println(nieuwpersoon);

        WerknemerDAO werknemerDAO = new WerknemerDAO(dBaccess);

        werknemerDAO.slaWerknemerOp(nieuwpersoon);


        dBaccess.closeConnection();

//        File personenbestand = new File("resources/Personen.csv");
//        File afdelingenbestand = new File("resources/Afdelingen.txt");
//        ArrayList <Persoon> personen = new ArrayList<>();
//
//
//
//        try (Scanner filescanner = new Scanner(afdelingenbestand)){
//            while (filescanner.hasNextLine()){
//                    afdelingen.add(new Afdeling(filescanner.nextLine(), filescanner.nextLine()));
//            }
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("Het bestand is niet gevonden.");
//        }
//
//
//        // Nu gaan alle regels ingelezen worden en ge-add worden aan de String Arraylist
//
//        try (Scanner filescanner = new Scanner(personenbestand)) {
//            while (filescanner.hasNext()) {
//                String[] waardenVanPersoon = filescanner.nextLine().split(",");
//
//
//                String typePersoon = waardenVanPersoon[0];
//                String naam = waardenVanPersoon[1];
//                String woonplaats = waardenVanPersoon[2];
//                Afdeling afdeling = afdelingen.get(Integer.parseInt(waardenVanPersoon[3]));
//                switch (typePersoon) {
//                    case "Werknemer":
//                        double maandsalaris = Double.parseDouble(waardenVanPersoon[4]);
//                        personen.add(new Werknemer(naam, woonplaats, afdeling, maandsalaris));
//                        break;
//                    case "Zzper":
//                        double uurTarief = Double.parseDouble(waardenVanPersoon[4]);
//                        personen.add(new Zzper(naam, woonplaats, uurTarief, afdeling));
//
//                        break;
//                    case "Vrijwilliger":
//                        personen.add(new Vrijwilliger(naam, woonplaats, afdeling));
//                        break;
//                }
//            }
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("Het bestand is niet gevonden.");
//        }
//
//        Collections.sort(personen);
//
//
//
//        File uitvoerbestand = new File("resources/PersonenPerAfdeling.txt");
//        try (PrintWriter printWriter = new PrintWriter(uitvoerbestand)){
//
//            for (Afdeling afdeling : afdelingen) {
//                printWriter.printf("Afdeling %s:\n", afdeling.getAfdelingNaam());
//                for (Persoon persoon : personen) {
//                    if (persoon.getAfdeling() == afdeling)
//                        printWriter.println(persoon);
//                }
//                printWriter.println();
//
//            }
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("Het is niet gelukt om het bestand aan te maken");
//
//        }
    }
}
