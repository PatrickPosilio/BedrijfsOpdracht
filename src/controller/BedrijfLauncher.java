package controller;

import model.Afdeling;
import model.Persoon;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class BedrijfLauncher {
    public static void main(String[] args) {
        Afdeling [] afdelingen = new Afdeling[4];
        String[] afdelingSoort = new String[] {"Uitvoering","Support", "Management", "Documentatie"};
        String[] afdelingsLocatie = new String[] {"Hilversum", "Amsterdam", "Almere", "Gouda"};

        for (int teller = 0; teller < afdelingen.length; teller++) {
            afdelingen[teller] = new Afdeling(afdelingSoort[teller], afdelingsLocatie[teller]);
        }

        Persoon baas = new Persoon("Mark", "Den Haag", 10000, afdelingen[2]);
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000, afdelingen[1]);
        Persoon assistent = new Persoon("Klaas");

        System.out.printf("Het aantal personen in het bedrijf is %d.\n", Persoon.getAantalPersonen());
        System.out.printf("%s werkt in %s en woont in %s\n",baas.getNaam(),baas.getWoonplaats(), baas.getAfdeling().getAfdelingsPlaats());
    }
}
