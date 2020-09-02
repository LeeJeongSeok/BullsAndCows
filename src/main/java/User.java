import javax.jnlp.SingleInstanceListener;
import java.util.Scanner;

public class User {

    Scanner scanner;
    int[] numbers = new int[3];

    public User() {
        scanner = new Scanner(System.in);
        userInput();
    }

    public void userInput() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i+1) + "번째 숫자를 입력해주세요 : ");
            numbers[i] = scanner.nextInt();
        }
    }

    public void isCoincide() {
        new Computer().result(numbers);
    }

}