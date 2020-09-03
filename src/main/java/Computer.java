import java.util.Random;

public class Computer {

    private int[] numbers;
    Number number = new Number();

    public Computer() {
        this.numbers = number.setRandomNumbers();
    }

    public int[] getNumbers() {
        return numbers;
    }
}
