import java.util.Random;

/**
 * COMP249 Assignment2 CasinoRoulette-Roulette Class
 * @author YangShen(7159390)
 * This is Roulette Class, this class is the super class of all roulette object.
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

    /**
     * This method accesses roulette's all number.
     * @return The number of roulette.
     */
    public String[] getNumbers() {
        return numbers;
    }

    /**
     * This method accesses the number of table choice.
     * @return The number of tableChoice.
     */
    public static int getTableChoice() {
        return tableChoice;
    }

    /**
     * This method randomizes a number between 0 and 1.
     * The number 0 represent the table is chosen to be European Roulette.
     * The number 1 represent the table is chosen to be American Roulette.
     */
    public static void tableChoice(){
        Random selectTable = new Random();
        tableChoice = selectTable.nextInt(2);
    }

    /**
     * This method takes the value of tableChoice to determine which set of number system should be use for setting winning number.
     * If it is European, the method randomize a number between 0 to 36 as the index of the table's number[].
     * If it is American, the method randomize a number between 0 to 37 as the index of the table's number[].
     */
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

    /**
     * This method cast the result from String to Integer.
     * @return  An int which is the integer value of result.
     */
    public static int getWinningNumber(){
        return Integer.parseInt(result);
    }

    /**
     * This method determine the result is an element of BlackNumber.
     * @return true if it is an element of BlackNumber, false if it is not an element of BlackNumber.
     */
    public static boolean isBlackNumber(){
        for(int i=0; i<blackNumber.length;i++) {
            if (result.equals(blackNumber[i]))
                return BlackNumber=true;
        }
        return BlackNumber=false;
    }

    /**
     * This method determine the result is an element of RedNumber.
     * @return true if it is an element of RedNumber, false if it is not an element of RedNumber.
     */
    public static boolean isRedNumber() {
        for (int i = 0; i < redNumber.length; i++)
            if (result.equals(redNumber[i])) {
                return RedNumber = true;
            }
        return RedNumber=false;
    }

    /**
     * This method determine the result is an even number.
     * @return true if it is an even number, false if it is not an even number.
     */
    public static boolean isEvenNumber(){
        if (Roulette.getWinningNumber()%2 == 0) {
            return EvenNumber = true;
        }
        else
        return EvenNumber = false;
    }

    /**
     * This method determine the result is an odd number.
     * @return true if it is an odd number, false if it is not an odd number.
     */
    public static boolean isOddNumber(){
        if (Roulette.getWinningNumber()%2 == 1) {
            return OddNumber = true;
        }
        else
        return OddNumber = false;
    }

    /**
     * This method determine the result is between 1 to 12.
     * @return true if it is between 1 to 12, false if it is not between 1 to 12.
     */
    public static boolean isFirst12(){
        if(Integer.parseInt(result)>0 && Integer.parseInt(result)<=12){
            return First12 = true;
        }
        else
        return First12 = false;
    }

    /**
     * This method determine the result is between 12 to 24.
     * @return true if it is between 12 to 24, false if it is not between 12 to 24.
     */
    public static boolean isSecond12(){
        if(Integer.parseInt(result)>12 && Integer.parseInt(result)<=24){
            return Second12 = true;
        }
        else
        return Second12 = false;
    }

    /**
     * This method determine the result is between 24 to 36.
     * @return true if it is between 24 to 36, false if it is not between 24 to 36.
     */
    public static boolean isLast12(){
        if(Integer.parseInt(result)>24 && Integer.parseInt(result)<=36){
            return Last12 = true;
        }
        else
        return Last12 = false;
    }

    /**
     * This method determine the result is between 1 to 18.
     * @return true if it is between 1 to 18, false if it is not between 1 to 18.
     */
    public static boolean isFirst18(){
        if(Integer.parseInt(result)>0 && Integer.parseInt(result)<=18){
            return First18 = true;
        }
        else
        return First18 = false;
    }

    /**
     * This method determine the result is between 18 to 36.
     * @return true if it is between 18 to 36, false if it is not between 18 to 36.
     */
    public static boolean isLast18(){
        if(Integer.parseInt(result)>18 && Integer.parseInt(result)<=36){
            return Last18 = true;
        }
        else
        return Last18 = false;
    }

    /**
     * This method determine the result is an element of tableLayout[][] from tableLayout[0][1] to tableLayout[0][13].
     * @return true if it is is an element of tableLayout[][] from tableLayout[0][1] to tableLayout[0][13], false otherwise.
     */
    public static boolean isFirstRow(){
        for(int i=0,j=1; j<13;j++) {
            if (result.equals(TableLayout[i][j]))
                return FirstRow = true;
            else
                FirstRow=false;
        }
            return FirstRow;
    }

    /**
     * This method determine the result is an element of tableLayout[][] from tableLayout[1][1] to tableLayout[1][13].
     * @return true if it is is an element of tableLayout[][] from tableLayout[1][1] to tableLayout[1][13], false otherwise.
     */
    public static boolean isSecondRow(){
        for(int i=1,j=1; j<13;j++) {
            if (result.equals(TableLayout[i][j]))
                SecondRow = true;
            else
                SecondRow=false;
        }
            return SecondRow;
    }

    /**
     * This method determine the result is an element of tableLayout[][] from tableLayout[2][1] to tableLayout[2][13].
     * @return true if it is is an element of tableLayout[][] from tableLayout[2][1] to tableLayout[2][13], false otherwise.
     */
    public static boolean isLastRow(){
        for(int i=2,j=1; j<13;j++) {
            if (result.equals(TableLayout[i][j]))
                LastRow=true;
            else
                LastRow=false;
        }
        return LastRow;
    }

    /**
     * This method mutates all the boolean value in Roulette class
     */
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

    /**
     * This method calculates all the logic when Player.Bet[] and result are set.
     * Depends on the result, the method loop each player's bet to find a match result.
     * Player gets paid if player's bet satisfied the logic condition(Even,Odd,Black,Red,etc).
     * @param p the Player who is about to calculated the winning.
     */
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
