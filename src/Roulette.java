import java.util.Random;
import java.util.Scanner;

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
    }

    public static int getWinningNumber(){
        return result;
    }

    public static void setInsideBet(Player p){
        Scanner kb = new Scanner(System.in);
        for(int j =0; j<p.insideBet.length; j++){
            p.insideBet[j] = kb.nextInt();
        }
    }

    public static void setOutsideBet(Player p){
        Scanner kb = new Scanner(System.in);
        for(int j =0; j<p.outsideBet.length; j++){
            p.outsideBet[j] = kb.next();
        }
    }

}
