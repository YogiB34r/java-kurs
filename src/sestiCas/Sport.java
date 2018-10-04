package sestiCas;

public interface Sport {
    public void setHomeTeam(String teamName);
    public void setAwayTeam(String teamName);
    public void setGameFullLength(int gameLength);
    public void setGameStartTime(int gameStartTime);
    public int getGameEndTime(int fullGameLength,int gameStartTime);

}
