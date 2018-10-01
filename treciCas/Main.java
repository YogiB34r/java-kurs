import java.util.Scanner;

public class F_cije {
    public static void main(String[] args) {
        int  niz[];
        Scanner scanner=new Scanner(System.in);
        System.out.print("Unesite velicinu niza: ");
        niz=new int[scanner.nextInt()];
        upis_u_niz(niz);
        ispis_iz_niza(niz);
        System.out.println("Zbir elemenata niza je: " +Zbir_elemenata_niza(niz));
        System.out.println("Maksimum niza je: "+nadji_maksimum_niza(niz));
        System.out.println("Minimum niza je: "+nadji_minimum_niza(niz));
        System.out.print("Unesite duzinu fibonacijevog niza: ");
        fibonacijev_niz(scanner.nextInt());
    }
   static void upis_u_niz(int[] niz)
   {
       for (int i=0;i<niz.length;i++)
       {
           Scanner scanner=new Scanner(System.in);
           System.out.print("Unesite element niza: ");
           niz[i]=scanner.nextInt();
       }
   }
   static void ispis_iz_niza(int[] niz)
   {
       for (int i =0;i<niz.length;i++)
       {
           System.out.print(niz[i]+" ");
       }
       System.out.println("\n");
   }
   static int Zbir_elemenata_niza(int[] niz)
   {
       int zbir=0;
       for (int i=0;i<niz.length;i++)
       {
           zbir+=niz[i];
       }
       return zbir;
   }
   static int nadji_maksimum_niza(int[] niz)
   {
       int max;
       max=niz[0];
       for (int i=1;i<niz.length;i++)
       {
           if (niz[i]>max)
           {
               max=niz[i];
           }
       }
       return max;
   }
   static int nadji_minimum_niza(int[] niz)
    {
        int min=niz[0];
        for (int i=0;i<niz.length;i++)
        {
            if (niz[i]<min)
            {
                min=niz[i];
            }
        }
        return min;
    }
    static void fibonacijev_niz(int duzina)
    {
        int niz[]=new int[duzina];
        niz[0]=1;
        niz[1]=1;
        for (int i=2;i<niz.length;i++)
        {
            niz[i]=niz[i-1]+niz[i-2];
        }
        ispis_iz_niza(niz);
    }
}
