import java.util.Random;

/**
 * Created by Racoonsy on 15-02-04.
 */
public abstract class Roulette {

    public static String [] numbers;
    private static String result;

    public Roulette() {
        this.numbers = new String [0];
    }
    public abstract String toString();

    public static String[] getNumbers() {
        return numbers;
    }

    public static void setWinningNumber(){
        int index = new Random().nextInt(38);
        result = numbers[index];
    }

    public static String getWinningNumber(){
        return result;
    }



}
