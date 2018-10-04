package cetvrtiCas;

public class SeniorProgramer extends Programer {
    private boolean lider;

    public SeniorProgramer(String ime, String prezime, int osnovnaPlata, String programskiJezik, int zarada, boolean lider) {
        super(ime, prezime, osnovnaPlata, programskiJezik, zarada);
        this.lider = lider;
    }
    public double obracunajZaradu() {
        if (lider){
            return getOsnovnaPlata() * 1.5;
        }
        return getOsnovnaPlata() * 1.2;
    }
}
