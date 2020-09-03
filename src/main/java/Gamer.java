import javax.jnlp.SingleInstanceListener;
import java.util.Scanner;

public class Gamer {

    private int[] numbers;
    Number number = new Number();

    public Gamer() {
        this.numbers = number.setRandomNumbers();
    }

    public int[] getNumbers() {
        return numbers;
    }
}