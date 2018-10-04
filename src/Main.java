import drugiCas.domaci.Domaci;
import sestiCas.Animal;
import sestiCas.Krava;

public class Main {
    public static void main(String[] args)
    {
        Animal zivotinja = new Krava(56,"opovo");
        zivotinja.oglasavanje();
        Krava.ispis((Krava)zivotinja);
    }
}
