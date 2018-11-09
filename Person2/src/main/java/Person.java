abstract class Person {

    protected String vorname;
    protected String nachname;

    protected Person() {
    }

    protected Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }

}
