import java.util.Random;

public class Number {

    public int[] numbers = new int[3];
    Random random = new Random();

    public int[] setRandomNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);

            // 두번째 숫자가 첫번째 숫자와 일치할 경우 다시 랜덤으로 뽑는다.
            if (i == 1) {
                if (numbers[i-1] == numbers[i]) {
                    numbers[i] = random.nextInt(10);
                }
            }
            // 세번째 숫자가 두번째와, 첫번째와 동일할 경우 다시 랜덤으로 뽑는다.
            if (i == 2) {
                if (numbers[i-1] == numbers[i]) {
                    numbers[i] = random.nextInt(10);
                }

                if (numbers[i-2] == numbers[i]) {
                    numbers[i] = random.nextInt(10);
                }
            }
        }

        return numbers;
    }
}
