public class Rule {

    int strike, ball, out = 0;

    public void setStrike(int strike) {
        this.strike += strike;
    }

    public void setBall(int ball) {
        this.ball += ball;
    }

    public void setOut(int out) {
        this.out += out;
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
