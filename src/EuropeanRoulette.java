import java.util.Arrays;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class EuropeanRoulette extends Roulette {

    public static String[] numbers = new String[37];
    private static String [][] EuroTableLayout = new String[3][13];
    public EuropeanRoulette() {
        numbers[0] = "0";
        numbers[1] = "32";
        numbers[2] = "15";
        numbers[3] = "19";
        numbers[4] = "4";
        numbers[5] = "21";
        numbers[6] = "2";
        numbers[7] = "25";
        numbers[8] = "17";
        numbers[9] = "34";
        numbers[10] = "6";
        numbers[11] = "27";
        numbers[12] = "13";
        numbers[13] = "36";
        numbers[14] = "11";
        numbers[15] = "30";
        numbers[16] = "8";
        numbers[17] = "23";
        numbers[18] = "10";
        numbers[19] = "5";
        numbers[20] = "24";
        numbers[21] = "16";
        numbers[22] = "33";
        numbers[23] = "1";
        numbers[24] = "20";
        numbers[25] = "14";
        numbers[26] = "31";
        numbers[27] = "9";
        numbers[28] = "22";
        numbers[29] = "18";
        numbers[30] = "29";
        numbers[31] = "7";
        numbers[32] = "28";
        numbers[33] = "12";
        numbers[34] = "35";
        numbers[35] = "3";
        numbers[36] = "26";

        EuroTableLayout[0][0]=" ";
        EuroTableLayout[0][1]="3";
        EuroTableLayout[0][2]="6";
        EuroTableLayout[0][3]="9";
        EuroTableLayout[0][4]="12";
        EuroTableLayout[0][5]="15";
        EuroTableLayout[0][6]="18";
        EuroTableLayout[0][7]="21";
        EuroTableLayout[0][8]="24";
        EuroTableLayout[0][9]="27";
        EuroTableLayout[0][10]="30";
        EuroTableLayout[0][11]="33";
        EuroTableLayout[0][12]="36";
        EuroTableLayout[1][0]="0";
        EuroTableLayout[1][1]="2";
        EuroTableLayout[1][2]="5";
        EuroTableLayout[1][3]="8";
        EuroTableLayout[1][4]="11";
        EuroTableLayout[1][5]="14";
        EuroTableLayout[1][6]="17";
        EuroTableLayout[1][7]="20";
        EuroTableLayout[1][8]="23";
        EuroTableLayout[1][9]="26";
        EuroTableLayout[1][10]="29";
        EuroTableLayout[1][11]="32";
        EuroTableLayout[1][12]="35";
        EuroTableLayout[2][0]=" ";
        EuroTableLayout[2][1]="1";
        EuroTableLayout[2][2]="4";
        EuroTableLayout[2][3]="7";
        EuroTableLayout[2][4]="10";
        EuroTableLayout[2][5]="13";
        EuroTableLayout[2][6]="16";
        EuroTableLayout[2][7]="19";
        EuroTableLayout[2][8]="22";
        EuroTableLayout[2][9]="25";
        EuroTableLayout[2][10]="28";
        EuroTableLayout[2][11]="31";
        EuroTableLayout[2][12]="34";

    }


    @Override
    public String[] getNumbers() {
        return numbers;
    }

    public static void toStringTableLayout(){
        System.out.print("European Table Layout:\n");
       for(int i=0; i<3; i++){
           for(int j=0; j<13;j++){
               System.out.print(EuroTableLayout[i][j] + "  ");
           }
           System.out.println();
       }
        System.out.println("Outside bets are:Even, Odd, Black, Red, First18, Last18," +
                "First12, Second12, " +
                "Last12, FirstRow, SecondRow, LastRow." +
                "\nPlease enter the same word when placing your bet.\n");
    }

    public String toString() {
        return "Ethan's European roulette v1.0 Feb 13 2015\n" +
                "Wheel: " + Arrays.toString(numbers);
    }
}
