public class Student extends Person {

    private String universitaet;
    private String studienfach;
    private int matrikelNr;

    public Student() {
    }

    public Student(String vorname, String nachname, String universitaet, String studienfach, int matrikelNr) {
        super(vorname, nachname);
        this.universitaet = universitaet;
        this.studienfach = studienfach;
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname +" (" + matrikelNr + ") studiert an der Universität " + universitaet + " das Studienfach " + studienfach + ".";
    }

}
