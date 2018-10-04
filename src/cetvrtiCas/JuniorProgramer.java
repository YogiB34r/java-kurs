package cetvrtiCas;

public class JuniorProgramer extends Programer {
    public JuniorProgramer(String ime, String prezime, int osnovnaPlata, String programskiJezik, int zarada) {
        super(ime, prezime, osnovnaPlata, programskiJezik, zarada);
    }

    public double obracunajZaradu() {
        return getOsnovnaPlata() * this.getZarada();
    }
}
