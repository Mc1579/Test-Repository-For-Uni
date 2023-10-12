import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class BenutzerdefinierteBinaereSuche {
    public static String suchLaufzeit;

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Das ist eine Binaere Suche");
        System.out.println("Geben Sie die Anzahl ein:");
        int anzahl = scanner.nextInt();

        List<Integer> zahlenListe = new ArrayList<>();

        for (int i = 0; i < anzahl; i++) {
            int zufallszahl = rand.nextInt(100);
            zahlenListe.add(zufallszahl);
        }

        Collections.sort(zahlenListe);

        int gesuchteZahl = zahlenListe.get(rand.nextInt(anzahl));

        long startSuche = System.nanoTime();

        int position = Collections.binarySearch(zahlenListe, gesuchteZahl);

        long endSuche = System.nanoTime();
        long suchLaufzeit = endSuche - startSuche;

        System.out.println("Die Liste der zufälligen Zahlen: " + zahlenListe);
        System.out.println("Die zu suchende Zahl ist: " + gesuchteZahl);

        if (position >= 0) {
            System.out.println("Die Zahl " + gesuchteZahl + " wurde an Position " + position + " gefunden.");
        } else {
            System.out.println("Die Zahl " + gesuchteZahl + " wurde nicht in der Liste gefunden.");
        }

        System.out.println("Laufzeit der Suche: " + suchLaufzeit + " Nanosekunden")
        ;
    }
}