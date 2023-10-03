package model;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class Vrijwilliger extends Persoon implements Oproepbaar{
    private int urenGewerkt;

    public Vrijwilliger(String naam, String woonplaats, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
    }
    public int huurIn(int urenGewerkt){
        this.urenGewerkt = urenGewerkt;
        berekenJaarInkomen();
        return urenGewerkt;
    }

    @Override
    public double berekenJaarInkomen() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " en is een vrijwilliger.";
    }

}
