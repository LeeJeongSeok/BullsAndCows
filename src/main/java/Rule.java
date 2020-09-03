public class Rule {

    int strike, ball, out = 0;

    public void setStrike(int strike) {
        this.strike += strike;
    }

    public void setBall(int ball) {
        this.ball += ball;
    }

    public int getOut() {
        return this.out;
    }

    public void setOut(int out) {
        this.out += out;
    }

    public void getScore(int[] computer, int[] gamer) {
        // 번호가 일치하는지 여부 판단 로직
        System.out.println("com : " + computer[0] + computer[1] + computer[2]);
        System.out.println("gamer : " + gamer[0] + gamer[1] + gamer[2]);

        for (int i = 0; i < computer.length; i++) {
            for (int j = 0; j < gamer.length; j++) {
                if (i == j && computer[i] == gamer[j]) { // 자리, 숫자가 완전히 일치하는 경우
                    setStrike(1);
                    continue;
                }

                if (i != j && computer[i] == gamer[j]) { // 자리는 틀리지만, 숫자가 같을 경우
                    setBall(1);
                    continue;
                }
                setOut(1);

                if (isOut(getOut())) {
                    System.out.println("out!!");
                    break;
                }
            }
        }
    }

    private boolean isOut(int outCount) {
        return outCount == 9;
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
