package domaci;

import java.util.Scanner;

public class Domaci_2 {
    public void domaci() {
        int a, b;
        System.out.println("Unesite ceo paran broj");
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.println("Unesite negativan broj");
                b = scanner.nextInt();
                if (b < 0){
                    System.out.println("Rezultat:");
                    System.out.println(a + b);
                }else {
                    System.out.println("Niste uneli negativan broj, pokušajte ponovo");
                }
            }else {
                System.out.println("Niste uneli paran broj");
            }
        } catch (Exception e) {
            System.out.println("Niste uneli ceo paran broj, pokušajte ponovo");
        }

    }
}
