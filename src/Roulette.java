import java.util.Random;

/**
 * Created by Racoonsy on 15-02-04.
 */
public abstract class Roulette {

    public static int [] numbers;
    private static int result;

    public Roulette() {
        this.numbers = new int [0];
    }
    public abstract String toString();

    public static void setWinningNumber(){
        int index = new Random().nextInt(38);
        result = numbers[index];
    };

    public static int getWinningNumber(){
        return result;
    };

}
