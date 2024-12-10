package baseball.model;

public class Result {
    private int strike;
    private int ball;

    public Result() {
        this.strike = 0;
        this.ball = 0;
    }

    public void clear() {
        this.strike = 0;
        this.ball = 0;
    }

    public void addStrike() {
        strike++;
    }

    public void addBall() {
        ball++;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
