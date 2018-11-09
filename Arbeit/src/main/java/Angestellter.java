public class Angestellter extends Arbeitnehmer {

    protected double gehalt;

    Angestellter(String beruf, String arbeitgeber, int gehalt) {
        super(beruf, arbeitgeber);
        this.gehalt = gehalt;
    }

    @Override
    public double getEntgelt() {
        return gehalt;
    }

}
