package model;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class Werknemer extends Persoon {
    private final static double GRENSWAARDE_BONUS = 4500.00;
    public static final int DEFAULT_MAANDSALARIS = 0;
    private double maandsalaris;





    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandsalaris) {
        super(naam, woonplaats, afdeling);
        setMaandsalaris(maandsalaris);
    }

    public Werknemer(String naam) {
        super(naam);

    }

    public Werknemer() {
    }

    public boolean heeftRechtOpBonus() { // als maandsalaris groter of gelijk is, return true, anders false
        return maandsalaris >= GRENSWAARDE_BONUS;
    }

    public  void setMaandsalaris(double maandsalaris) {
        if (maandsalaris < DEFAULT_MAANDSALARIS) {
            throw new IllegalArgumentException("Het maandsalaris mag niet negatief zijn");
        }
        this.maandsalaris = maandsalaris;
    }

    public double berekenJaarInkomen() {
        if (heeftRechtOpBonus()) {
            return 12 * maandsalaris + maandsalaris;
        } else {
            return 12 * maandsalaris;
        }
    }

    public String toString() {
        if (heeftRechtOpBonus()) {
            return super.toString() + " en is een werknemer met recht op een bonus.";
        } else {
            return super.toString() + " en is een werknemer zonder recht op een bonus.";
        }
    }

}
