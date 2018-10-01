package domaci;

import java.util.Scanner;

public class Domaci_1 {
    public void domaci() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("Izaberite jednu od ponuđenih opcija");
            System.out.println("1 - Saberite dva broja" + "\n" + "2 - Oduzmite dva broja" + "\n"
                    + "3 - Pomnožite dva broja" + "\n" + "4 - Ugasite aplikaciju");
            int option = scanner.nextInt(), a, b;
            switch (option) {
                case 1:
                    System.out.println("Izabrali ste opciju sabiranja");
                    System.out.println("Unesite prvi broj");
                    a = scanner.nextInt();
                    System.out.println("Unesite drugi broj");
                    b = scanner.nextInt();
                    System.out.println("Rezultat:");
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println("Izabrali ste opciju oduzimanja");
                    System.out.println("Unesite prvi broj");
                    a = scanner.nextInt();
                    System.out.println("Unesite drugi broj");
                    b = scanner.nextInt();
                    System.out.println("Rezultat");
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println("Izabrali ste opciju množenja");
                    System.out.println("Unesite prvi broj");
                    a = scanner.nextInt();
                    System.out.println("Unesite drugi broj");
                    b = scanner.nextInt();
                    System.out.println("Rezultat");
                    System.out.println(a * b);
                    break;
                case 4:
                    exit = true;
                default:
                    System.out.println("Uneli ste pogrešnu opciju pokušajte ponovo");
                    break;

            }
        } while (!exit);
    }
}
