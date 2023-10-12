import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

    public class BenutzerdefinierteSeqSuche {
        public static void main(String[] args) {
            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Geben Sie die Anzahl ein:");
            int anzahl = scanner.nextInt();

            List<Integer> zahlenListe = new ArrayList<>();

            for (int i = 0; i < anzahl; i++) {
                int zufallszahl = rand.nextInt(100);
                zahlenListe.add(zufallszahl);
            }

            int gesuchteZahl = zahlenListe.get(rand.nextInt(anzahl));

            long startSuche = System.nanoTime();

            int position = sequenzielleSuche(zahlenListe, gesuchteZahl);

            long endSuche = System.nanoTime();
            long suchLaufzeit = endSuche - startSuche;

            System.out.println("Das ist eine Seq-Suche");
            System.out.println("Die Liste der zufälligen Zahlen: " + zahlenListe);
            System.out.println("Die zu suchende Zahl ist: " + gesuchteZahl);

            if (position >= 0) {
                System.out.println("Die Zahl " + gesuchteZahl + " wurde an Position " + position + " gefunden.");
            } else {
                System.out.println("Die Zahl " + gesuchteZahl + " wurde nicht in der Liste gefunden.");
            }


            System.out.println("Laufzeit der Suche: " + suchLaufzeit + " Nanosekunden");
        }

        public static int sequenzielleSuche(List<Integer> liste, int gesuchteZahl) {
            for (int i = 0; i < liste.size(); i++) {
                if (liste.get(i) == gesuchteZahl) {
                    return i;
                }
            }
            return -1;
        }
    }

