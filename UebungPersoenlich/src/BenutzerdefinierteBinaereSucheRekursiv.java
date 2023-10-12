import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BenutzerdefinierteBinaereSucheRekursiv {
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

        int position = binäreSucheRekursiv(zahlenListe, gesuchteZahl, 0, zahlenListe.size() - 1);

        System.out.println("Die Liste der zufälligen Zahlen: " + zahlenListe);
        System.out.println("Die zu suchende Zahl ist: " + gesuchteZahl);

        if (position >= 0) {
            System.out.println("Die Zahl " + gesuchteZahl + " wurde an Position " + position + " gefunden.");
        } else {
            System.out.println("Die Zahl " + gesuchteZahl + " wurde nicht in der Liste gefunden.");
        }
    }

    public static int binäreSucheRekursiv(List<Integer> liste, int gesuchteZahl, int links, int rechts) {
        if (links <= rechts) {
            int mitte = links + (rechts - links) / 2;

            if (liste.get(mitte) == gesuchteZahl) {
                return mitte;
            } else if (liste.get(mitte) < gesuchteZahl) {
                return binäreSucheRekursiv(liste, gesuchteZahl, mitte + 1, rechts); // Suche in der rechten Hälfte
            } else {
                return binäreSucheRekursiv(liste, gesuchteZahl, links, mitte - 1); // Suche in der linken Hälfte
            }
        }
        return -1;
    }
}