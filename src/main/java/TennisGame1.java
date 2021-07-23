public class TennisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (this.player1Name.equals(playerName)) {
            m_score1++;
        } else {
            m_score2++;
        }
    }

    public String getScore() {
        String[] scoreResults = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        if (isDraw()) {
            return scoreResults[m_score1] + "-" + "All";
        }
        if (isDeuce()) {
            return "Deuce";
        }
        if (isExtraScore() && m_score1 > m_score2) {
            return getPrefix() + this.player1Name;
        }
        if (isExtraScore()) {
            return getPrefix() + this.player2Name;
        }
        return scoreResults[m_score1] + "-" +scoreResults[m_score2];
    }

    private boolean isDeuce() {
        return m_score1 == m_score2 && m_score1 > 2;
    }

    private boolean isDraw() {
        return m_score1 == m_score2 && m_score1 <= 2;
    }
    private boolean isExtraScore() {
        return m_score1 >= 4 || m_score2 >= 4 ;
    }

    private String getPrefix (){
        if (Math.abs(m_score1 - m_score2) == 1) {
            return "Advantage ";
        } else {
            return "Win for ";
        }
    }
}