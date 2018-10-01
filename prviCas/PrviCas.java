package prviCas;
import java.util.Scanner;

public class PrviCas {
    public static void prviCas(){
        Scanner scanner = new Scanner(System.in);
//        int a = 10, b = 5 , c;
//        c = a + b;
//        c = c + 5;
//
//        System.out.println("Zdravo Svete"); //Ispisuje stvari u konzoli

//        c = scanner.nextInt();
//        System.out.println("Promenljiva c ima vrednost: " + c); // Scanner ceka input iz konzole
//        int q , w , e;
//        q = scanner.nextInt();
//        w = scanner.nextInt();
//        e = q + w;
//        System.out.println(e);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= 0){
            System.out.println("pozitivan");
        }
        else {
            System.out.println("negativan");
        }
        if (a % 2 == 0){
            System.out.println("Paran");
        }else {
            System.out.println("Neparan");
        }
        if (a > b) {
            System.out.println(a + " je vece od " + b);
        }else if (b > a) {
            System.out.println(b + " je vece od " + a);
        }
    }
}
