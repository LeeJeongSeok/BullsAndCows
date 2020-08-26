import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i+1) + "번째 숫자를 입력해주세요 : ");
            numbers[i] = scanner.nextInt();
        }

        new User().isCoincide(numbers);
    }
}
