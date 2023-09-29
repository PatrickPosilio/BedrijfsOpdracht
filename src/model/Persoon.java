package model;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class Persoon {
    public static final int DEFAULT_MAANDSALARIS = 0;
    public static final String DEFAULT_WOONPLAATS = "Onbekend";
    public static final String DEFAULT_NAAM = "Onbekend";
    public static int aantalPersonen = 0;
    private int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandsalaris;
    public final static double GRENSWAARDE_BONUS = 4500.00;
    private Afdeling afdeling;


    public Persoon (String naam, String woonplaats, double maandsalaris, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandsalaris = maandsalaris;
        this.personeelsNummer = ++aantalPersonen;
        this.afdeling = afdeling;
        setMaandsalaris(maandsalaris);
    }

    public Persoon (String naam) {
        this(naam, DEFAULT_WOONPLAATS, DEFAULT_MAANDSALARIS, new Afdeling());
    }

    public Persoon() {
        this(DEFAULT_NAAM);
    }

    public double berekenJaarInkomen() {
        return 12 * maandsalaris;
    }

    public boolean heeftRechtOpBonus() { // als maandsalaris groter of gelijk is, return true, anders false
        return maandsalaris >= GRENSWAARDE_BONUS;
    }

    public String printRechtOpBonus() {
        if (heeftRechtOpBonus()){
            return "en heeft wel recht op bonus.";
        } else {
            return "en heeft niet recht op bonus.";
        }
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    public String getNaam() {
        return naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public  void setMaandsalaris(double maandsalaris) {
        if (maandsalaris < 0) {
            System.out.println("Het bedrag moet positief zijn, het maandsalaris wordt nu op 1 gezet");
            this.maandsalaris = DEFAULT_MAANDSALARIS;
        } else {
            this.maandsalaris = maandsalaris;
        }
    }
    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public static int getAantalPersonen() {
        return aantalPersonen;
    }
}

