abstract class Arbeitnehmer {

    protected String beruf;
    protected String arbeitgeber;

    protected Arbeitnehmer(String beruf, String arbeitgeber) {
        this.beruf = beruf;
        this.arbeitgeber = arbeitgeber;
    }

    abstract public double getEntgelt();

    public String getBeruf() {
        return beruf;
    }

    public String getArbeitgeber() {
        return arbeitgeber;
    }

}
