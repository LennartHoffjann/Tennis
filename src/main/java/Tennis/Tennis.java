package Tennis;

public class Tennis {
    private int scorePlayerOne = 0;
    private int scorePlayerTwo = 0;

    public String getScore() {
        if (scorePlayerOne == 0 && scorePlayerTwo == 0) {
            return ScoreToString(scorePlayerOne) + ", " + ScoreToString(scorePlayerTwo);

        } else if (scorePlayerTwo < 3 && scorePlayerOne < 3) {
            return ScoreToString(scorePlayerOne) + ", " + ScoreToString(scorePlayerTwo);
        } else if (scorePlayerTwo < 4 && scorePlayerOne < 4 && scorePlayerOne != scorePlayerTwo) {
            return ScoreToString(scorePlayerOne) + ", " + ScoreToString(scorePlayerTwo);
        } else {
            if (scorePlayerOne == scorePlayerTwo + 1) {
                return "Advantage Player One";
            } else if (scorePlayerTwo == scorePlayerOne + 1) {
                return "Advantage Player Two";
            } else if (scorePlayerOne == scorePlayerTwo) {
                return "Deuce";
            } else if (scorePlayerOne > scorePlayerTwo + 1) {
                return "Player One won";
            } else {
                return "Player Two won";
            }
        }
    }

    public String ScoreToString(int i) {
        if (i == 1) {
            return "15";
        } else if (i == 2) {
            return "30";
        } else if (i == 3) {
            return "40";
        } else {
            return "love";
        }

    }

    public void playerOneScores() {
        scorePlayerOne++;
    }

    public void playerTwoScores() {
        scorePlayerTwo++;
    }
}
