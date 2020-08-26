import sun.jvm.hotspot.ui.tree.RootTreeNodeAdapter;

import java.util.Random;

public class BullsAndCows {

    Random random;
    int[] bulls;

    public BullsAndCows() {

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
}
