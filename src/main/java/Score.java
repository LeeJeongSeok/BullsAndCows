public class Score {

    int strike, ball, out = 0;

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    @Override
    public String toString() {
        return "Result{" +
                "strike=" + strike +
                ", ball=" + ball +
                ", out=" + out +
                '}';
    }
}
