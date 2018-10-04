package sestiCas;

public interface Kosarka extends Sport {
    public int teamHomeScored(int points);
    public int teamAwayScored(int points);
    public int getQuarterTime(int fullGameLength);
}
