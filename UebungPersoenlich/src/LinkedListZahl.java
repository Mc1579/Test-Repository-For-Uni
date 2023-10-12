import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinkedListZahl {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl der zu generierenden Zahlen ein:");
        int anzahl = scanner.nextInt();

        for (int i = 0; i < anzahl; i++) {
            int zufallszahl = rand.nextInt(0,100);
            integerList.add(zufallszahl);
        }
        System.out.println("Das ist die Unsortierte-Generierte-Liste:" + integerList);

        Collections.sort(integerList);



        System.out.println("Sortierte Liste der Integer-Zahlen:");
        for (Integer num : integerList) {
            System.out.println(num);
        }
    }
}