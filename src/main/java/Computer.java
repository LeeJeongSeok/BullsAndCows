import java.util.Random;

public class Computer {

    public void getNumber() {
        Number number = new Number();
        number.setRandomNumbers();
    }

//    public void findNumber(int[] numbers, Rule score) {
//
//        // 번호가 일치하는지 여부 판단 로직
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < bulls.length; j++) {
//               if (i == j && numbers[i] == bulls[j]) { // 질문으로 오는 숫
//                   score.setStrike(1);
//                   continue;
//               }
//
//               if (i != j && numbers[i] == bulls[j]) {
//                   score.setBall(1);
//                   continue;
//               }
//
//               score.setOut(1);
//            }
//        }
//    }
//
//    // 10회 동안 숫자를 비교한다.
//    public void result(int[] numbers) {
//        for (int i = 0; i < 10; i++) {
//            findNumber(numbers, new Rule());
//        }
//    }

}
