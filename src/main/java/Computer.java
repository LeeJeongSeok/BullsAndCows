import java.util.Random;

public class Computer {

    Random random;
    int[] bulls;

    public Computer() {

        random = new Random();
        bulls = new int[3];

        setRandomNumber();
    }

    private void setRandomNumber() {
        for (int i = 0; i < bulls.length; i++) {
            bulls[i] = random.nextInt(10);

            // 두번째 숫자가 첫번째 숫자와 일치할 경우 다시 랜덤으로 뽑는다.
            if (i == 1) {
                if (bulls[i-1] == bulls[i]) {
                    bulls[i] = random.nextInt(10);
                }
            }
            // 세번째 숫자가 두번째와, 첫번째와 동일할 경우 다시 랜덤으로 뽑는다.
            if (i == 2) {
                if (bulls[i-1] == bulls[i]) {
                    bulls[i] = random.nextInt(10);
                    System.out.println("1");
                }

                if (bulls[i-2] == bulls[i]) {
                    bulls[i] = random.nextInt(10);
                    System.out.println("2");
                }
            }
            System.out.println("number : " + bulls[i]);
        }
    }

    public void findNumber(int[] numbers) {
        // 번호가 일치하는지 여부 판단 로직
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < bulls.length; j++) {
                if (numbers[i] == bulls[i]) { // 자릿수와 숫자가 일치
                    new Score().setStrike(1);
                } else {

                }
            }
        }

        // 결과를 Result에 던짐
    }

    public void showReuslt() {
        new Score().toString();
    }

}
