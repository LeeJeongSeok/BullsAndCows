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

    public void getScore(int[] computer, int[] gamer) {
        // 번호가 일치하는지 여부 판단 로직
        System.out.println("com : " + computer[0] + computer[1] + computer[2]);
        System.out.println("com : " + gamer[0] + gamer[1] + gamer[2]);

        for (int i = 0; i < computer.length; i++) {
            for (int j = 0; j < gamer.length; j++) {
                if (i == j && computer[i] == gamer[j]) { // 질문으로 오는 숫
                    setStrike(1);
                    continue;
                }

                if (i != j && computer[i] == gamer[j]) {
                    setBall(1);
                    continue;
                }
                setOut(1);
            }
        }
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
