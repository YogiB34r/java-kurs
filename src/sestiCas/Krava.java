package sestiCas;

public class Krava implements Animal {
    private int kilaza;
    private String mestoBoravka;
    public Krava (int kilaza,String mestoBoravka){
        this.kilaza = kilaza;
        this.mestoBoravka = mestoBoravka;
    }
    public void oglasavanje(){
        System.out.println("MOOOOO");
    }
    public static void ispis(Krava krava){
        System.out.println("Krava:");
        System.out.println(krava.kilaza);
        System.out.println(krava.mestoBoravka);
    }
}
