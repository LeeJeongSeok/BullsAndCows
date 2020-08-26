public class BullsAndCows {

    int innings = 0;

    public BullsAndCows(Computer computer, User user) {
        isCoincide(computer, user);
    }

    private void isCoincide(Computer computer, User user) {
        for (int i = 0; i < 10; i++) {

            innings++;
            isEnd(innings);
        }
    }

    private void isEnd(int innings) {
        if (innings == 9) {
            System.out.println("게임이 종료되었습니다.");
        }
    }
}
