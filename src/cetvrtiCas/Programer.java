package cetvrtiCas;

abstract class Programer extends Radnik {
    private String programskiJezik;
    private int zarada;

    public Programer(String ime, String prezime, int osnovnaPlata, String programskiJezik, int zarada) {
        super(ime, prezime, osnovnaPlata);
        this.programskiJezik = programskiJezik;
        this.zarada = zarada;
    }

    public int getZarada() {
        return zarada;
    }

    public void setZarada(int zarada) {
        this.zarada = zarada;
    }

    public void getProgramerInfo(){
        System.out.println("Ime: " + getIme());
        System.out.println("Prezime: " + getPrezime());
        System.out.println("Programski jezik: " + this.programskiJezik );
        System.out.println("Plata: " + this.zarada);
    }
}
