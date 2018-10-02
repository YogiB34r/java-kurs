package drugiCas.domaci;

import helper.Helper;

import java.util.Scanner;

public class Domaci {
    private static Helper helper = new Helper();
    private static Scanner scanner = new Scanner(System.in);

    public static void meni() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("Izaberite jednu od ponuđenih opcija: ");
            System.out.println("1 - Trougao");
            System.out.println("2 - Invertovani trougao");
            System.out.println("3 - Ponavljanje broja unutar niza");
            System.out.println("0 - Izlaz");
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    trougao();
                    break;
                case 2:
                    invertovaniTrougao();
                    break;
                case 3:
                    ponavljanjeBrojaUnutarNiza();
                    break;
                default:
                    System.out.println("Uneli ste pogrešnu opciju pokušajte ponovo");
                    break;

            }
        } while (!exit);
    }

    private static void trougao() {
        System.out.print("Unesite broj željenih kolona : ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k <= i * 2; k++) {
                System.out.print(k + 1);
                if (k == i * 2) {
                    for (int l = k; l > i; l--) {
                        System.out.print(l);
                    }
                }
            }
            System.out.println(" ");
        }
    }


    private static void invertovaniTrougao() {
        System.out.print("Unesite broj željenih kolona : ");
        int rows = scanner.nextInt();
        for (int i = rows; i >= 0; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    private static void ponavljanjeBrojaUnutarNiza() {
        System.out.print("Unesite željenu dužinu niza: ");
        int array[] = helper.manualCreateArray(scanner.nextInt());
        System.out.print("Unesite broj za koji želite da izračunate broj ponavljanja: ");
        int number = scanner.nextInt();
        int i = 0;
        for (int value : array) {
            if (value == number) {
                i++;
            }
        }
        System.out.println("Uneti broj je pronađen " + i + " puta");
    }
}
