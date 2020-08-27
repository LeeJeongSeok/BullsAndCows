import javax.jnlp.SingleInstanceListener;
import java.util.Scanner;

public class User {
    public void isCoincide(int[] numbers, Score score) {
        new Computer().findNumber(numbers, score);
    }
}