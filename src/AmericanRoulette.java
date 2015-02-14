import java.util.Arrays;

/**
 * COMP249 Assignment2 CasinoRoulette-Roulette Class-AmericanRoulette
 *
 * This is AmericanRoulette Class, this class is the inherited class from Roulette.
 * @author YangShen(7159390)
 */

public class AmericanRoulette extends Roulette {

    public static String[] numbers = new String[38];
    private static String [][] AmericanTableLayout = new String[3][13];
    public AmericanRoulette() {
        numbers[0] = "0";
        numbers[1] = "28";
        numbers[2] = "9";
        numbers[3] = "26";
        numbers[4] = "30";
        numbers[5] = "11";
        numbers[6] = "7";
        numbers[7] = "20";
        numbers[8] = "32";
        numbers[9] = "17";
        numbers[10] = "5";
        numbers[11] = "22";
        numbers[12] = "34";
        numbers[13] = "15";
        numbers[14] = "3";
        numbers[15] = "24";
        numbers[16] = "36";
        numbers[17] = "13";
        numbers[18] = "1";
        numbers[19] = "00";
        numbers[20] = "27";
        numbers[21] = "10";
        numbers[22] = "25";
        numbers[23] = "29";
        numbers[24] = "12";
        numbers[25] = "8";
        numbers[26] = "19";
        numbers[27] = "31";
        numbers[28] = "18";
        numbers[29] = "6";
        numbers[30] = "21";
        numbers[31] = "33";
        numbers[32] = "16";
        numbers[33] = "4";
        numbers[34] = "23";
        numbers[35] = "35";
        numbers[36] = "14";
        numbers[37] = "2";

        AmericanTableLayout[0][0]="00";
        AmericanTableLayout[0][1]="3";
        AmericanTableLayout[0][2]="6";
        AmericanTableLayout[0][3]="9";
        AmericanTableLayout[0][4]="12";
        AmericanTableLayout[0][5]="15";
        AmericanTableLayout[0][6]="18";
        AmericanTableLayout[0][7]="21";
        AmericanTableLayout[0][8]="24";
        AmericanTableLayout[0][9]="27";
        AmericanTableLayout[0][10]="30";
        AmericanTableLayout[0][11]="33";
        AmericanTableLayout[0][12]="36";
        AmericanTableLayout[1][0]=" ";
        AmericanTableLayout[1][1]="2";
        AmericanTableLayout[1][2]="5";
        AmericanTableLayout[1][3]="8";
        AmericanTableLayout[1][4]="11";
        AmericanTableLayout[1][5]="14";
        AmericanTableLayout[1][6]="17";
        AmericanTableLayout[1][7]="20";
        AmericanTableLayout[1][8]="23";
        AmericanTableLayout[1][9]="26";
        AmericanTableLayout[1][10]="29";
        AmericanTableLayout[1][11]="32";
        AmericanTableLayout[1][12]="35";
        AmericanTableLayout[2][0]="0";
        AmericanTableLayout[2][1]="1";
        AmericanTableLayout[2][2]="4";
        AmericanTableLayout[2][3]="7";
        AmericanTableLayout[2][4]="10";
        AmericanTableLayout[2][5]="13";
        AmericanTableLayout[2][6]="16";
        AmericanTableLayout[2][7]="19";
        AmericanTableLayout[2][8]="22";
        AmericanTableLayout[2][9]="25";
        AmericanTableLayout[2][10]="28";
        AmericanTableLayout[2][11]="31";
        AmericanTableLayout[2][12]="34";

    }

    /**
     * This method overridden the getNumber() from its super class.
     * @return the numbers of wheel.
     */
    @Override
    public String[] getNumbers() {
        return numbers;
    }

    /**
     * This method calculates all the logic when Player.Bet[] and result are set.
     * Depends on the result, the method loop each player's bet to find a match result.
     * Player gets paid if player's bet satisfied the logic condition(Even,Odd,Black,Red,etc).
     * @param p the Player who is about to calculated the winning.
     */
    public static void payOutCalculation(Player p) {
        Roulette.isEvenNumber();
        Roulette.isOddNumber();
        Roulette.isBlackNumber();
        Roulette.isRedNumber();
        Roulette.isFirst12();
        Roulette.isSecond12();
        Roulette.isLast12();
        Roulette.isFirst18();
        Roulette.isLast18();

        if((p.getTokenReduction() >0&& p.getTokenReduction()<1) || p.getTokenReduction() == 1) {
            if (p.Bet[0].equals(result))
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

        else
                    for (int i = 0; i < 6; i++) {
                        if (p.Bet[i].equalsIgnoreCase(result))

                            p.doubleStreet(p);

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

    /**
     *This method print out the AmericanTable layout.
     * It also print the outside bet options for players.
     */
    public static void toStringTableLayout(){
        System.out.print("American Table Layout:\n");
        for(int i=0; i<3; i++){
            for(int j=0; j<13;j++){
                System.out.print(AmericanTableLayout[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Outside bets are:Even, Odd, Black, Red, First18, Last18," +
                "First12, Second12, " +
                "Last12, FirstRow, SecondRow, LastRow." +
                "\nPlease enter the same word when placing your bet.\n");
    }

    /**
     * This method shows the wheel number.
     * @return A String displaying the wheel number.
     */
    public String toString() {
        return "Ethan's American roulette v1.0 Feb 13 2015\n" +
                "Wheel: " + Arrays.toString(numbers);
    }
}
