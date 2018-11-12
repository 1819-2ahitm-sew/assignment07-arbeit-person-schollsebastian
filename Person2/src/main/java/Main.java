import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person[] personenliste = new Person[1000];
        int counter = 0;
        String input;


        do {
            printMenu();
            input = input();

            switch (input) {
                case "1":
                    String[] schuelerDaten = newSchueler();

                    if (schuelerDaten.length != 5) {
                        System.out.println("Ungültige Eingabe.");
                    } else {
                        personenliste[counter] = new Schueler(schuelerDaten[0], schuelerDaten[1], schuelerDaten[2], schuelerDaten[3], Integer.valueOf(schuelerDaten[4]));
                        counter++;
                    }
                    break;
                case "2":
                    String[] studentDaten = newStudent();

                    if (studentDaten.length != 5) {
                        System.out.println("Ungültige Eingabe.");
                    } else {
                        personenliste[counter] = new Student(studentDaten[0], studentDaten[1], studentDaten[2], studentDaten[3], Integer.valueOf(studentDaten[4]));
                        counter++;
                    }
                    break;
                case "3":
                    for (int i = 0; i < counter; i++) {
                        System.out.println(personenliste[i]);
                    }
                    break;
                case "4":
                    for (int i = 0; i < counter; i++) {
                        if (personenliste[i] instanceof Schueler) {
                            System.out.println(personenliste[i]);
                        }
                    }
                    break;
                case "5":
                    for (int i = 0; i < counter; i++) {
                        if (personenliste[i] instanceof Student) {
                            System.out.println(personenliste[i]);
                        }
                    }
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        } while (!input.equals("exit"));

    }

    private static String[] newStudent() {
        String student;

        System.out.print("Schüler [Vorname, Nachname, Universität, Studienfach, Matrikel Nr.]: ");
        student = input();
        return student.split(", ");
    }

    private static String[] newSchueler() {
        String schueler;

        System.out.print("Schüler [Vorname, Nachname, Schule, Klasse, Katalog Nr.]: ");
        schueler = input();
        return schueler.split(", ");
    }

    private static void printMenu() {
        System.out.println("1 - Eingabe eines Schülers");
        System.out.println("2 - Eingabe eines Studenten");
        System.out.println("3 - Ausgabe der Liste am Bildschirm");
        System.out.println("4 - Ausgabe aller Schüler am Bildschirm");
        System.out.println("5 - Ausgabe aller Studenten am Bildschirm");
    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
