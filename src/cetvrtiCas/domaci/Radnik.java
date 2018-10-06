package cetvrtiCas.domaci;

abstract class Radnik {
    private String ime;
    private String prezime;
    private int osnovnaPlata;
    public Radnik(String ime, String prezime,int osnovnaPlata){
        this.ime = ime;
        this.prezime = prezime;
        this.osnovnaPlata = osnovnaPlata;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract double obracunajZaradu();

    public int getOsnovnaPlata() {
        return osnovnaPlata;
    }

    public void setOsnovnaPlata(int osnovnaPlata) {
        this.osnovnaPlata = osnovnaPlata;
    }
}
