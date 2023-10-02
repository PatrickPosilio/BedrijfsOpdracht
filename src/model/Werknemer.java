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
        this.maandsalaris = maandsalaris;
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
            System.out.println("Het bedrag moet positief zijn, het maandsalaris wordt nu op 0 gezet");
            this.maandsalaris = DEFAULT_MAANDSALARIS;
        } else {
            this.maandsalaris = maandsalaris;
        }
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
            return super.toString() + String.format(" en is een werknemer met recht op een bonus");
        } else {
            return super.toString() + String.format(" en is een werknemer zonder recht op een bonus");
        }
    }
}
