import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] zahlenfolge = {3, 5, 7, 9, 11, 13, 15, 17, 19};




        System.out.print("Die Liste lautet: {3, 5, 7, 9, 11, 13, 15, 17, 19}\n" +
                "(Achtung, es handelt sich hier um die Array Position --> Anfang von 0)\n");

        System.out.print("Geben Sie die zu suchende Zahl ein: ");
        int gesuchteZahl = scanner.nextInt();


        int position = -1;

        for (int i = 0; i < zahlenfolge.length; i++) {
            if (zahlenfolge[i] == gesuchteZahl) {
                position = i;
                break;
            }
        }

        // Das Ergebnis anzeigen
        if (position != -1) {
            System.out.println("Die Zahl " + gesuchteZahl + " wurde an Array-Position " + position + " gefunden.");
        } else {
            System.out.println("Die Zahl " + gesuchteZahl + " wurde nicht gefunden.");
        }

        scanner.close();
    }
}