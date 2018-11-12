public class Arbeiter extends Arbeitnehmer {

    private double stundenlohn;

    Arbeiter(String beruf, String arbeitgeber, double stundenlohn) {
        super(beruf, arbeitgeber);
        this.stundenlohn = stundenlohn;
    }

    @Override
    public double getEntgelt() {
        return stundenlohn * 40;
    }

}
