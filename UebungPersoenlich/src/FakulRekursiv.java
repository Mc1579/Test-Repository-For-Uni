import java.util.Scanner;

public class FakulRekursiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculations = true;

        while (continueCalculations) {
            System.out.println("Geben Sie die zu berechnende Zahl ein:");
            int anzahl = scanner.nextInt();

            int number = anzahl;
            long factorial = calculateFactorial(number);
            System.out.println("Die Fakultät von " + number + " ist " + factorial);

            System.out.println("Möchten Sie eine weitere Berechnung durchführen? (J/N):");
            scanner.nextLine();
            String userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("J")) {
                continueCalculations = false;
            }
        }
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative Zahlen sind nicht möglich");
        }
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
