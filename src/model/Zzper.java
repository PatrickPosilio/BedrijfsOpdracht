package model;

import java.util.Scanner;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class Zzper extends Persoon {

    public static final int DEFAULT_UREN_GEWERKT = 0;
    private double uurtarief;
    private int urenGewerkt;

    public Zzper(String naam, String woonplaats, double uurtarief, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
        this.uurtarief = uurtarief;
        this.urenGewerkt = DEFAULT_UREN_GEWERKT;
    }

    public int huurIn(int urenGewerkt){
        this.urenGewerkt = urenGewerkt;
        berekenJaarInkomen();
        return urenGewerkt;
    }
    public double berekenJaarInkomen() {
        return uurtarief * urenGewerkt;
    }
    public String toString() {
        return super.toString() + String.format(" en is een zzp-er met een uurtarief van %.1f", uurtarief);
    }

}
