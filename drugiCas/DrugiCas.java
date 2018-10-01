package drugiCas;
import java.util.ArrayList;
import java.util.Scanner;

public class DrugiCas {
    public static void drugiCas() {
        Scanner scanner = new Scanner(System.in);
        //For

//        int count = scanner.nextInt();
//        for (int i = 0; i <= count; i++) {
//            int brojac = 0;
//            int x = scanner.nextInt();
//            for (int j = 2; j < x; j++) {
//                if (x % j == 0) {
//                    brojac++;
//                }
//            }
//            if (brojac == 0) {
//                System.out.println("broj je prost");
//            }
//        }
        //while

//        System.out.println("Unesite minimum dvocifren pozitivan broj");
//        int count = scanner.nextInt();
//        int zbir = 0;
//        while (count > 0) {
//            zbir += count % 10;
//            count /= 10;
//        }
//        System.out.println("Zbir cifara unetog broja je:" + zbir);

        //array
//        int[] niz = new int[5];
//        niz[0] = 1;
//        niz[1] = 4;
//        niz[2] = 6;
//        niz[3] = 7;
//        niz[4] = 99;
//
//        int vrednostNaPrvomMestu = niz[0];
//        int vrednostNadrugomMestuJe = niz[1];
//
//        for (int i = 0; i < niz.length;i++){
//            System.out.println(niz[i] + ",");
//        }
//        System.out.println("Unesite duzinu niza");
//        int n = scanner.nextInt();
//        int[] niz = new int[n];
//        for (int i = 0;i<niz.length;i++){
//            System.out.println("Unesite " + i + " element u nizu");
//            niz[i] = scanner.nextInt();
//        }
//        int zbir = 0;
//        for (int i = 0; i<niz.length;i++){
//            zbir += niz[i];
//        }
//        if (zbir>15){
//            System.out.println("Zbir " + zbir + " je veci od 15");
//        }else {
//            System.out.println("Zbir " + zbir + " je manji od 15");
//        }
        //Lista
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i = 0;i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}


