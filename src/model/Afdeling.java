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

    public String getAfdelingNaam() {
        return afdelingNaam;
    }

    public void setAfdelingNaam(String afdelingNaam) {
        this.afdelingNaam = afdelingNaam;
    }

    public String getAfdelingPlaats() {
        return afdelingPlaats;
    }

    public void setAfdelingPlaats(String afdelingPlaats) {
        this.afdelingPlaats = afdelingPlaats;
    }


}


