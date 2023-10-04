package model;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public abstract class Persoon implements Comparable <Persoon> {
    public static int aantalPersonen = 0;
    public static final String DEFAULT_NAAM = "Onbekend";
    protected static final String DEFAULT_WOONPLAATS = "Onbekend";

    protected int personeelsNummer;
    protected String naam;
    protected String woonplaats;

    protected Afdeling afdeling;


    public Persoon (String naam, String woonplaats, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.afdeling = afdeling;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon (String naam) {
        this(naam, DEFAULT_WOONPLAATS, new Afdeling());
    }

    public Persoon() {
        this(DEFAULT_NAAM);
    }

    public abstract double berekenJaarInkomen();

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    public static int getAantalPersonen() {
        return aantalPersonen;
    }

    public String toString() {
        return String.format("-- %s woont in %s en werkt op %s", naam, woonplaats, afdeling.toString() );
    }

    @Override
    public int compareTo(Persoon anderePersoon) {
        return naam.compareTo(anderePersoon.getNaam());
    }
}

