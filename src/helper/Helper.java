package helper;

import java.util.Scanner;
public class Helper {
    private static Scanner scanner = new Scanner(System.in);

    public int[] manualCreateArray(int n) {
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Unesite element niza: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
