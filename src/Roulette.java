import java.util.Random;

/**
 * Created by Racoonsy on 15-02-04.
 */
public  class Roulette {

    protected static String [] numbers;
    private static String [][] TableLayout = new String[3][13];
    protected static String [] blackNumber = new String[18];
    protected static String [] redNumber = new String[18];
    protected static String result;
    protected static String Even = "Even";
    protected static String Odd = "Odd";
    protected static String Black = "Black";
    protected static String Red = "Red";
    protected static String first12 = "first12";
    protected static String second12 = "second12";
    protected static String last12 = "last12";
    protected static String first18 = "first18";
    protected static String last18 = "last18";
    protected static String firstRow = "firstRow";
    protected static String secondRow = "secondRow";
    protected static String lastRow = "lastRow";
    protected static int tableChoice;
    protected static boolean BlackNumber;
    protected static boolean RedNumber;
    protected static boolean EvenNumber;
    protected static boolean OddNumber;
    protected static boolean First12;
    protected static boolean Second12;
    protected static boolean Last12;
    protected static boolean First18;
    protected static boolean Last18;
    protected static boolean FirstRow;
    protected static boolean SecondRow;
    protected static boolean LastRow;

    public Roulette() {
        this.numbers = new String [0];

        blackNumber[0] = "2";
        blackNumber[1] = "4";
        blackNumber[2] = "6";
        blackNumber[3] = "8";
        blackNumber[4] = "10";
        blackNumber[5] = "11";
        blackNumber[6] = "13";
        blackNumber[7] = "15";
        blackNumber[8] = "17";
        blackNumber[9] = "20";
        blackNumber[10] = "22";
        blackNumber[11] = "24";
        blackNumber[12] = "26";
        blackNumber[13] = "28";
        blackNumber[14] = "29";
        blackNumber[15] = "31";
        blackNumber[16] = "33";
        blackNumber[17] = "35";

        redNumber[0] = "1";
        redNumber[1] = "3";
        redNumber[2] = "5";
        redNumber[3] = "7";
        redNumber[4] = "9";
        redNumber[5] = "12";
        redNumber[6] = "14";
        redNumber[7] = "16";
        redNumber[8] = "18";
        redNumber[9] = "19";
        redNumber[10] = "21";
        redNumber[11] = "23";
        redNumber[12] = "25";
        redNumber[13] = "27";
        redNumber[14] = "30";
        redNumber[15] = "32";
        redNumber[16] = "34";
        redNumber[17] = "36";

        TableLayout[0][0]=" ";
        TableLayout[0][1]="3";
        TableLayout[0][2]="6";
        TableLayout[0][3]="9";
        TableLayout[0][4]="12";
        TableLayout[0][5]="15";
        TableLayout[0][6]="18";
        TableLayout[0][7]="21";
        TableLayout[0][8]="24";
        TableLayout[0][9]="27";
        TableLayout[0][10]="30";
        TableLayout[0][11]="33";
        TableLayout[0][12]="36";
        TableLayout[1][0]="0";
        TableLayout[1][1]="2";
        TableLayout[1][2]="5";
        TableLayout[1][3]="8";
        TableLayout[1][4]="11";
        TableLayout[1][5]="14";
        TableLayout[1][6]="17";
        TableLayout[1][7]="20";
        TableLayout[1][8]="23";
        TableLayout[1][9]="26";
        TableLayout[1][10]="29";
        TableLayout[1][11]="32";
        TableLayout[1][12]="35";
        TableLayout[2][0]=" ";
        TableLayout[2][1]="1";
        TableLayout[2][2]="4";
        TableLayout[2][3]="7";
        TableLayout[2][4]="10";
        TableLayout[2][5]="13";
        TableLayout[2][6]="16";
        TableLayout[2][7]="19";
        TableLayout[2][8]="22";
        TableLayout[2][9]="25";
        TableLayout[2][10]="28";
        TableLayout[2][11]="31";
        TableLayout[2][12]="34";

        BlackNumber=false;
        RedNumber=false;
        EvenNumber=false;
        OddNumber=false;
        First12=false;
        Second12=false;
        Last12=false;
        First18=false;
        Last18=false;

    }

    public String[] getNumbers() {
        return numbers;
    }

    public static int getTableChoice() {
        return tableChoice;
    }

    public static void tableChoice(){
        Random selectTable = new Random();
        tableChoice = selectTable.nextInt(2);
    }

    public static void setWinningNumber(){
        if (tableChoice == 0) {
            int index = new Random().nextInt(37);
            result = EuropeanRoulette.numbers[index];
        }

        else if (tableChoice == 1) {
            int index = new Random().nextInt(38);
            result = AmericanRoulette.numbers[index];
        }

    }

    public static int getWinningNumber(){
        return Integer.parseInt(result);
    }

    public static boolean isBlackNumber(){
        for(int i=0; i<blackNumber.length;i++) {
            if (result.equals(blackNumber[i]))
                return BlackNumber=true;
        }
        return BlackNumber=false;
    }

    public static boolean isRedNumber() {
        for (int i = 0; i < redNumber.length; i++)
            if (result.equals(redNumber[i])) {
                return RedNumber = true;
            }
        return RedNumber=false;
    }

    public static boolean isEvenNumber(){
        if (Roulette.getWinningNumber()%2 == 0) {
            return EvenNumber = true;
        }
        else
        return EvenNumber = false;
    }

    public static boolean isOddNumber(){
        if (Roulette.getWinningNumber()%2 == 1) {
            return OddNumber = true;
        }
        else
        return OddNumber = false;
    }

    public static boolean isFirst12(){
        if(Integer.parseInt(result)>0 && Integer.parseInt(result)<=12){
            return First12 = true;
        }
        else
        return First12 = false;
    }

    public static boolean isSecond12(){
        if(Integer.parseInt(result)>12 && Integer.parseInt(result)<=24){
            return Second12 = true;
        }
        else
        return Second12 = false;
    }

    public static boolean isLast12(){
        if(Integer.parseInt(result)>24 && Integer.parseInt(result)<=36){
            return Last12 = true;
        }
        else
        return Last12 = false;
    }

    public static boolean isFirst18(){
        if(Integer.parseInt(result)>0 && Integer.parseInt(result)<=18){
            return First18 = true;
        }
        else
        return First18 = false;
    }

    public static boolean isLast18(){
        if(Integer.parseInt(result)>18 && Integer.parseInt(result)<=36){
            return Last18 = true;
        }
        else
        return Last18 = false;
    }
    
    public static boolean isFirstRow(){
        for(int i=0,j=1; j<13;j++) {
            if (result.equals(TableLayout[i][j]))
                return FirstRow = true;
            else
                FirstRow=false;
        }
            return FirstRow;
    }

    public static boolean isSecondRow(){
        for(int i=1,j=1; j<13;j++) {
            if (result.equals(TableLayout[i][j]))
                SecondRow = true;
            else
                SecondRow=false;
        }
            return SecondRow;
    }

    public static boolean isLastRow(){
        for(int i=2,j=1; j<13;j++) {
            if (result.equals(TableLayout[i][j]))
                LastRow=true;
            else
                LastRow=false;
        }
        return LastRow;
    }


    public static void booleanCheck(){
        Roulette.isEvenNumber();
        Roulette.isOddNumber();
        Roulette.isBlackNumber();
        Roulette.isRedNumber();
        Roulette.isFirst12();
        Roulette.isSecond12();
        Roulette.isLast12();
        Roulette.isFirst18();
        Roulette.isLast18();
        Roulette.isFirstRow();
        Roulette.isSecondRow();
        Roulette.isLastRow();
    }

    public static void payOutCalculation(Player p){
        //if a Player just bet 1 time, then execute first IF statement.
        if((p.getTokenReduction() >0&& p.getTokenReduction()<1) || p.getTokenReduction() == 1) {   //If the Player's bet is between 0 to 1(Vip player gets 5% discount)
                                                                                    //therefore it is possible to have less than 1 bet (0.95 bet).
            if (p.Bet[0].equals(result))            //If the Player's bet is a number and matches the winning number,
                                                                                    //Then he/her gets pay.
                p.straight(p);

            else {
                if (EvenNumber == true && p.Bet[0].equalsIgnoreCase(Even) ||
                     (OddNumber == true && p.Bet[0].equalsIgnoreCase(Odd)) ||
                        (BlackNumber == true && p.Bet[0].equalsIgnoreCase(Black)) ||
                        (RedNumber == true && p.Bet[0].equalsIgnoreCase(Red)) ||
                        (First18 == true && p.Bet[0].equalsIgnoreCase(first18)) ||
                        (Last18 == true && p.Bet[0].equalsIgnoreCase(last18))){


                    p.payOneTime(p);
                }
                else if
                    ((First12 == true && p.Bet[0].equalsIgnoreCase(first12)) ||
                        (Second12 == true && p.Bet[0].equalsIgnoreCase(second12)) ||
                        (Last12 == true && p.Bet[0].equalsIgnoreCase(last12)) ||
                        (FirstRow==true && p.Bet[0].equalsIgnoreCase(firstRow)) ||
                        (SecondRow==true && p.Bet[0].equalsIgnoreCase(secondRow)) ||
                        (LastRow==true && p.Bet[0].equalsIgnoreCase(lastRow))){

                    p.payTwoTimes(p);
                }
            }

        }


        else if((p.getTokenReduction() > 1 && p.getTokenReduction()<2) || p.getTokenReduction() == 2) {
            for (int i = 0; i < 2; i++) {
                if (result.equals(p.Bet[i]))

                    p.split(p);

                else {
                    if (EvenNumber == true && p.Bet[i].equalsIgnoreCase(Even) ||
                            (OddNumber == true && p.Bet[i].equalsIgnoreCase(Odd)) ||
                            (BlackNumber == true && p.Bet[i].equalsIgnoreCase(Black)) ||
                            (RedNumber == true && p.Bet[i].equalsIgnoreCase(Red)) ||
                            (First18 == true && p.Bet[i].equalsIgnoreCase(first18)) ||
                            (Last18 == true && p.Bet[i].equalsIgnoreCase(last18))){


                        p.payOneTime(p);
                    }
                    else if
                            ((First12 == true && p.Bet[i].equalsIgnoreCase(first12)) ||
                                    (Second12 == true && p.Bet[i].equalsIgnoreCase(second12)) ||
                                    (Last12 == true && p.Bet[i].equalsIgnoreCase(last12)) ||
                                    (FirstRow==true && p.Bet[i].equalsIgnoreCase(firstRow)) ||
                                    (SecondRow==true && p.Bet[i].equalsIgnoreCase(secondRow)) ||
                                    (LastRow==true && p.Bet[i].equalsIgnoreCase(lastRow))){

                        p.payTwoTimes(p);
                    }
                }
            }
        }
        else if((p.getTokenReduction() > 2 && p.getTokenReduction()<3) || p.getTokenReduction() == 3) {
            for (int i = 0; i < 3; i++) {
                if (result.equals(p.Bet[i]))

                    p.street(p);

                else {
                    if (EvenNumber == true && p.Bet[i].equalsIgnoreCase(Even) ||
                            (OddNumber == true && p.Bet[i].equalsIgnoreCase(Odd)) ||
                            (BlackNumber == true && p.Bet[i].equalsIgnoreCase(Black)) ||
                            (RedNumber == true && p.Bet[i].equalsIgnoreCase(Red)) ||
                            (First18 == true && p.Bet[i].equalsIgnoreCase(first18)) ||
                            (Last18 == true && p.Bet[i].equalsIgnoreCase(last18))) {


                        p.payOneTime(p);
                    } else if
                            ((First12 == true && p.Bet[i].equalsIgnoreCase(first12)) ||
                                    (Second12 == true && p.Bet[i].equalsIgnoreCase(second12)) ||
                                    (Last12 == true && p.Bet[i].equalsIgnoreCase(last12)) ||
                                    (FirstRow == true && p.Bet[i].equalsIgnoreCase(firstRow)) ||
                                    (SecondRow == true && p.Bet[i].equalsIgnoreCase(secondRow)) ||
                                    (LastRow == true && p.Bet[i].equalsIgnoreCase(lastRow))) {

                        p.payTwoTimes(p);
                    }
                }
            }
        }
        else if((p.getTokenReduction() > 3 && p.getTokenReduction() < 4) || p.getTokenReduction() == 4) {
            for (int i = 0; i < 4; i++) {
                if (result.equals(p.Bet[i]))

                    p.square(p);

                else {
                    if (EvenNumber == true && p.Bet[i].equalsIgnoreCase(Even) ||
                            (OddNumber == true && p.Bet[i].equalsIgnoreCase(Odd)) ||
                            (BlackNumber == true && p.Bet[i].equalsIgnoreCase(Black)) ||
                            (RedNumber == true && p.Bet[i].equalsIgnoreCase(Red)) ||
                            (First18 == true && p.Bet[i].equalsIgnoreCase(first18)) ||
                            (Last18 == true && p.Bet[i].equalsIgnoreCase(last18))) {


                        p.payOneTime(p);
                    } else if
                            ((First12 == true && p.Bet[i].equalsIgnoreCase(first12)) ||
                                    (Second12 == true && p.Bet[i].equalsIgnoreCase(second12)) ||
                                    (Last12 == true && p.Bet[i].equalsIgnoreCase(last12)) ||
                                    (FirstRow == true && p.Bet[i].equalsIgnoreCase(firstRow)) ||
                                    (SecondRow == true && p.Bet[i].equalsIgnoreCase(secondRow)) ||
                                    (LastRow == true && p.Bet[i].equalsIgnoreCase(lastRow))) {

                        p.payTwoTimes(p);
                    }
                }
            }
        }
        else if((p.getTokenReduction() > 4 && p.getTokenReduction() < 5) || p.getTokenReduction() == 5){
            for(int i=0; i<5;i++){
                if (result.equals(p.Bet[i]))

                    p.topLine(p);

                else {
                    if (EvenNumber == true && p.Bet[i].equalsIgnoreCase(Even) ||
                            (OddNumber == true && p.Bet[i].equalsIgnoreCase(Odd)) ||
                            (BlackNumber == true && p.Bet[i].equalsIgnoreCase(Black)) ||
                            (RedNumber == true && p.Bet[i].equalsIgnoreCase(Red)) ||
                            (First18 == true && p.Bet[i].equalsIgnoreCase(first18)) ||
                            (Last18 == true && p.Bet[i].equalsIgnoreCase(last18))) {


                        p.payOneTime(p);
                    } else if
                            ((First12 == true && p.Bet[i].equalsIgnoreCase(first12)) ||
                                    (Second12 == true && p.Bet[i].equalsIgnoreCase(second12)) ||
                                    (Last12 == true && p.Bet[i].equalsIgnoreCase(last12)) ||
                                    (FirstRow == true && p.Bet[i].equalsIgnoreCase(firstRow)) ||
                                    (SecondRow == true && p.Bet[i].equalsIgnoreCase(secondRow)) ||
                                    (LastRow == true && p.Bet[i].equalsIgnoreCase(lastRow))) {

                        p.payTwoTimes(p);
                    }
                }
            }
        }
    }
}
