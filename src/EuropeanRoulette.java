import java.util.Arrays;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class EuropeanRoulette extends Roulette {

    public int[] numbers = new int[37];

    public EuropeanRoulette() {
        numbers[0] = 0;
        numbers[1] = 32;
        numbers[2] = 15;
        numbers[3] = 19;
        numbers[4] = 4;
        numbers[5] = 21;
        numbers[6] = 2;
        numbers[7] = 25;
        numbers[8] = 17;
        numbers[9] = 34;
        numbers[10] = 6;
        numbers[11] = 27;
        numbers[12] = 13;
        numbers[13] = 36;
        numbers[14] = 11;
        numbers[15] = 30;
        numbers[16] = 8;
        numbers[17] = 23;
        numbers[18] = 10;
        numbers[19] = 5;
        numbers[20] = 24;
        numbers[21] = 16;
        numbers[22] = 33;
        numbers[23] = 1;
        numbers[24] = 20;
        numbers[25] = 14;
        numbers[26] = 31;
        numbers[27] = 9;
        numbers[28] = 22;
        numbers[29] = 18;
        numbers[30] = 29;
        numbers[31] = 7;
        numbers[32] = 28;
        numbers[33] = 12;
        numbers[34] = 35;
        numbers[35] = 3;
        numbers[36] = 26;
    }

    public String toString() {
        return "Ethan European roulette v1.0 Feb 13 2015\n" +
                "Wheel: " + Arrays.toString(numbers);
    }
}
