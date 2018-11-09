import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String file = readFile("personen.csv");
        String[] namen = file.split(";");
        Person[] bewohner = new Person[namen.length / 2 - 2];

        for (int i = 2; i < bewohner.length; i += 2) {
            bewohner[]
        }

        System.out.println(file);

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
