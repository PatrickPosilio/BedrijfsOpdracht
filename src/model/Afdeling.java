package model;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class Afdeling {
    private String afdelingNaam;
    private String afdelingPlaats;

    public Afdeling(String afdelingNaam, String afdelingPlaats) {
        this.afdelingNaam = afdelingNaam;
        this.afdelingPlaats = afdelingPlaats;
    }



    public Afdeling() {
    }
    public String toString() {
        return String.format("afdeling %s te %s", afdelingNaam, afdelingPlaats);
    }
}


