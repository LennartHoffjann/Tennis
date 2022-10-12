package Tennis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {
    Tennis game;

    @BeforeEach
    void SetUp(){
        game = new Tennis();
    }
    @Test
    void GameJustStarted() {
        String score = game.getScore();
        assertThat(score).isEqualTo("love, love");
    }
    @Test
    void PlayerOneScores(){
        game.playerOneScores();
        String score = game.getScore();
        assertThat(score).isEqualTo("15, love");
    }
    @Test
    void PlayerOneScoresTwoTimes(){
        game.playerOneScores();
        game.playerOneScores();
        String score = game.getScore();
        assertThat(score).isEqualTo("30, love");
    }
    @Test
    void PlayerOneScoresTheeTimes(){
        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        String score = game.getScore();
        assertThat(score).isEqualTo("40, love");
    }
    @Test
    void PlayerScores(){
        game.playerTwoScores();
        String score = game.getScore();
        assertThat(score).isEqualTo("love, 15");
    }
    @Test
    void PlayerScoresFourTimes(){
        for(int i = 0; i < 3; i ++) {
            game.playerTwoScores();
        }
        String score = game.getScore();
        System.out.println(score);
        assertThat(score).isEqualTo("love, 40");
    }
    @Test
    void PlayerOneScoresFourTimesPlayerTwoScoresFourTimes(){
        for(int i = 0; i < 3; i ++) {
            game.playerTwoScores();
        }
        for(int i = 0; i < 3; i ++) {
            game.playerOneScores();
        }
        String score = game.getScore();
        System.out.println(score);
        assertThat(score).isEqualTo("Deuce");
    }
    @Test
    void PlayerOneScoresFourTimesPlayerTwoScoresThreeTimes(){
        for(int i = 0; i < 2; i ++) {
            game.playerTwoScores();
        }
        for(int i = 0; i < 3; i ++) {
            game.playerOneScores();
        }
        String score = game.getScore();
        System.out.println(score);
        assertThat(score).isEqualTo("40, 30");
    }
    @Test
    void PlayerOneScoresFiveTimesPlayerTwoScoresThreeTimes(){
        for(int i = 0; i < 2; i ++) {
            game.playerTwoScores();
        }
        for(int i = 0; i < 4; i ++) {
            game.playerOneScores();
        }
        String score = game.getScore();
        System.out.println(score);
        assertThat(score).isEqualTo("Player One won");
    }
    @Test
    void PlayerOneScoresFiveTimesPlayerTwoScoresFourTimes(){
        for(int i = 0; i < 3; i ++) {
            game.playerTwoScores();
        }
        for(int i = 0; i < 4; i ++) {
            game.playerOneScores();
        }
        String score = game.getScore();
        System.out.println(score);
        assertThat(score).isEqualTo("Advantage Player One");
    }
    @Test
    void PlayerOneScoresFiveTimesPlayerTwoScoresSixTimes(){
        for(int i = 0; i < 5; i ++) {
            game.playerTwoScores();
        }
        for(int i = 0; i < 4; i ++) {
            game.playerOneScores();
        }
        String score = game.getScore();
        System.out.println(score);
        assertThat(score).isEqualTo("Advantage Player Two");
    }
}
