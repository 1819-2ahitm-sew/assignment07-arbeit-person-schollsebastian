import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputString;
        String[] input;
        Arbeitnehmer[] liste = new Arbeitnehmer[1000];
        int counter = 0;

        do {
            inputString = input();
            input = inputString.split(", ");

            if (input.length == 4) {
                if (input[0].equals("Arbeiter")) {
                    liste[counter] = new Arbeiter(input[1], input[2], Integer.valueOf(input[3]));
                    counter++;
                } else if (input[0].equals("Angestellter")) {
                    liste[counter] = new Angestellter(input[1], input[2], Integer.valueOf(input[3]));
                    counter++;
                } else {
                    System.out.println("Ungültige Eingabe.");
                }
            } else if (inputString.equals("print")) {

            } else {
                System.out.println("Ungültige Eingabe.");
            }
        } while (!inputString.equals("print"));

        for (int i = 0; i < counter; i++) {
            if (liste[i] instanceof Arbeiter) {
                System.out.println("Arbeiter: Übt den Beruf " + liste[i].getBeruf() + " beim Arbeitgeber " + liste[i].getArbeitgeber() + " aus. Der Lohn beträgt " + liste[i].getEntgelt() + "€.");
            } else if (liste[i] instanceof Angestellter) {
                System.out.println("Angestellter: Übt den Beruf " + liste[i].getBeruf() + " beim Arbeitgeber " + liste[i].getArbeitgeber() + " aus. Der Gehalt beträgt " + liste[i].getEntgelt() + "€.");
            }
        }

    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Arbeitnehmer ein [Arbeiter/Angestellter, Beruf, Arbeitgeber, Stundenlohn/Gehalt]: ");
        return scanner.nextLine();
    }
}
