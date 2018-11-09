public class Schueler extends Person {

    private String schule;
    private String klasse;
    private int katalogNr;

    public Schueler() {
    }

    public Schueler(String vorname, String nachname, String schule, String klasse, int katalogNr) {
        super(vorname, nachname);
        this.schule = schule;
        this.klasse = klasse;
        this.katalogNr = katalogNr;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + " (Nr. " + katalogNr + ") besucht die Schule " + schule + " und geht in die Klasse " + klasse + ".";
    }
}
