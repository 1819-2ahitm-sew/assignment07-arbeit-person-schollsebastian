import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String file = readFile("personen.csv");
        String[] namen = file.split("\n");
        Person[] bewohner = new Person[namen.length - 1];

        for (int i = 0; i < bewohner.length; i++) {
            bewohner[i] = new Person(namen[i + 1].split(";")[0], namen[i + 1].split(";")[1]);
        }

        for (int i = 0; i < bewohner.length; i++) {
            System.out.println(bewohner[i]);
        }

    }

    public static String readFile(String fileName) {

        StringBuilder sb = new StringBuilder();

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
                sb.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return sb.toString();

    }

}
