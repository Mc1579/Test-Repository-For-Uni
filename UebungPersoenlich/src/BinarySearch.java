import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
        public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);

                    int[] zahlenfolge = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
                    Arrays.sort(zahlenfolge);

                    System.out.print("Die Liste Lautet:1, 3, 5, 7, 9, 11, 13, 15, 17, 19 \n" +
                            "Geben Sie die zu suchende Zahl ein: ");

                    String input = scanner.next();
                        int gesuchteZahl = Integer.parseInt(input);

                        int position = Arrays.binarySearch(zahlenfolge, gesuchteZahl);

                        if (position >= 0) {
                            System.out.println("Die Zahl " + gesuchteZahl + " wurde an Position " + position + " gefunden.");
                        } else {
                            System.out.println("Die Zahl " + gesuchteZahl + " wurde nicht in der Zahlenfolge gefunden.");
                        }
                    scanner.close();
                }
            }

