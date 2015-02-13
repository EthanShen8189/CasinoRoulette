import java.util.Arrays;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class AmericanRoulette extends Roulette {

    public static String[] numbers = new String[38];
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

    }

    @Override
    public String[] getNumbers() {
        return numbers;
    }

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

        //if a Player just bet 1 time, then execute first IF statement.
        if((p.getTokenReduction() >0&& p.getTokenReduction()<1) || p.getTokenReduction() == 1) {   //If the Player's bet is between 0 to 1(Vip player gets 5% discount)
            //therefore it is possible to have less than 1 bet (0.95 bet).
            if (String.valueOf(p.Bet[0]).equals(String.valueOf(result)))            //If the Player's bet is a number and matches the winning number,
                //Then he/her gets pay.
                p.straight();

            else if(EvenNumber == true && p.Bet[0].equalsIgnoreCase(Even) ||        //If the Player's bet is in outside the table,
                    (OddNumber == true && p.Bet[0].equalsIgnoreCase(Odd)) ||        //For even,odd,black,red,first12,second12, he/her gets pay.
                    (BlackNumber == true && p.Bet[0].equalsIgnoreCase(Black)) ||
                    (RedNumber == true && p.Bet[0].equalsIgnoreCase(Red)) ||
                    (First18 == true && p.Bet[0].equalsIgnoreCase(first18)) ||
                    (Last18 == true && p.Bet[0].equalsIgnoreCase(last18)))

                p.payOneTime();

            else if((First12 == true && p.Bet[0].equalsIgnoreCase(first12)) ||
                    (Second12 == true && p.Bet[0].equalsIgnoreCase(second12)) ||
                    (Last12 == true && p.Bet[0].equalsIgnoreCase(last12)) /*||
                    String.valueOf(p.Bet[0]).equalsIgnoreCase(String.valueOf(firstRow)) ||
                    String.valueOf(p.Bet[0]).equalsIgnoreCase(String.valueOf(secondRow)) ||
                    String.valueOf(p.Bet[0]).equalsIgnoreCase(String.valueOf(lastRow))*/)

                p.payTwoTimes();
        }


        else if((p.getTokenReduction() > 1 && p.getTokenReduction()<2) || p.getTokenReduction() == 2){
            for(int i=0; i<2;i++){
                if (String.valueOf(p.Bet[i]).equals(result))

                    p.split();
                else if (EvenNumber == true && p.Bet[i].equalsIgnoreCase(Even) ||
                        (OddNumber == true && p.Bet[i].equalsIgnoreCase(Odd)))

                    p.payOneTime();

                else if((BlackNumber == true && p.Bet[i].equalsIgnoreCase(Black)) ||
                        (RedNumber == true && p.Bet[i].equalsIgnoreCase(Red)))

                    p.payOneTime();

                else if((First18 == true && p.Bet[i].equalsIgnoreCase(first18)) ||
                        (Last18 == true && p.Bet[i].equalsIgnoreCase(last18)))

                    p.payOneTime();

                else if((First12 == true && p.Bet[i].equalsIgnoreCase(first12)) ||
                        (Second12 == true && p.Bet[i].equalsIgnoreCase(second12)) ||
                        (Last12 == true && p.Bet[i].equalsIgnoreCase(last12)))

                    p.payTwoTimes();

                    /*while (String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(firstRow)) ||
                        String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(secondRow)) ||
                        String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(lastRow)))

                        Player.payTwoTimes(p);*/
            }
        }

        else if((p.getTokenReduction() > 2 && p.getTokenReduction()<3) || p.getTokenReduction() == 3){
            for(int i=0; i<3;i++){
                if (String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(result)))

                    p.street();

                else if (EvenNumber == true && p.Bet[i].equalsIgnoreCase(Even) ||
                        (OddNumber == true && p.Bet[i].equalsIgnoreCase(Odd)))

                    p.payOneTime();

                else if((BlackNumber == true && p.Bet[i].equalsIgnoreCase(Black)) ||
                        (RedNumber == true && p.Bet[i].equalsIgnoreCase(Red)))

                    p.payOneTime();

                else if((First18 == true && p.Bet[i].equalsIgnoreCase(first18)) ||
                        (Last18 == true && p.Bet[i].equalsIgnoreCase(last18)))

                    p.payOneTime();

                else if((First12 == true && p.Bet[i].equalsIgnoreCase(first12)) ||
                        (Second12 == true && p.Bet[i].equalsIgnoreCase(second12)) ||
                        (Last12 == true && p.Bet[i].equalsIgnoreCase(last12)))

                    p.payTwoTimes();

                    /*while (String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(firstRow)) ||
                        String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(secondRow)) ||
                        String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(lastRow)))

                        Player.payTwoTimes(p);*/
            }
        }

        else if((p.getTokenReduction() > 3 && p.getTokenReduction() < 4) || p.getTokenReduction() == 4){
            for(int i=0; i<4;i++){
                if (String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(result)))

                    p.square();

                else if (EvenNumber == true && p.Bet[i].equalsIgnoreCase(Even) ||
                        (OddNumber == true && p.Bet[i].equalsIgnoreCase(Odd)))

                    p.payOneTime();

                else if((BlackNumber == true && p.Bet[i].equalsIgnoreCase(Black)) ||
                        (RedNumber == true && p.Bet[i].equalsIgnoreCase(Red)))

                    p.payOneTime();

                else if((First18 == true && p.Bet[i].equalsIgnoreCase(first18)) ||
                        (Last18 == true && p.Bet[i].equalsIgnoreCase(last18)))

                    p.payOneTime();

                else if((First12 == true && p.Bet[i].equalsIgnoreCase(first12)) ||
                        (Second12 == true && p.Bet[i].equalsIgnoreCase(second12)) ||
                        (Last12 == true && p.Bet[i].equalsIgnoreCase(last12)))

                    p.payTwoTimes();
            }
        }

        else if((p.getTokenReduction() > 4 && p.getTokenReduction() < 5) || p.getTokenReduction() == 5){
            for(int i=0; i<5;i++){
                if (String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(result)))

                    p.topLine();

                else if (EvenNumber == true && p.Bet[i].equalsIgnoreCase(Even) ||
                        (OddNumber == true && p.Bet[i].equalsIgnoreCase(Odd)))

                    p.payOneTime();

                else if((BlackNumber == true && p.Bet[i].equalsIgnoreCase(Black)) ||
                        (RedNumber == true && p.Bet[i].equalsIgnoreCase(Red)))

                    p.payOneTime();

                else if((First18 == true && p.Bet[i].equalsIgnoreCase(first18)) ||
                        (Last18 == true && p.Bet[i].equalsIgnoreCase(last18)))

                    p.payOneTime();

                else if((First12 == true && p.Bet[i].equalsIgnoreCase(first12)) ||
                        (Second12 == true && p.Bet[i].equalsIgnoreCase(second12)) ||
                        (Last12 == true && p.Bet[i].equalsIgnoreCase(last12)))

                    p.payTwoTimes();
            }
        }
        else{
            for(int i=0; i<6;i++){
                if (String.valueOf(p.Bet[i]).equalsIgnoreCase(String.valueOf(result)))

                    p.doubleStreet();

                else if (EvenNumber == true && p.Bet[i].equalsIgnoreCase(Even) ||
                        (OddNumber == true && p.Bet[i].equalsIgnoreCase(Odd)))

                    p.payOneTime();

                else if((BlackNumber == true && p.Bet[i].equalsIgnoreCase(Black)) ||
                        (RedNumber == true && p.Bet[i].equalsIgnoreCase(Red)))

                    p.payOneTime();

                else if((First18 == true && p.Bet[i].equalsIgnoreCase(first18)) ||
                        (Last18 == true && p.Bet[i].equalsIgnoreCase(last18)))

                    p.payOneTime();

                else if((First12 == true && p.Bet[i].equalsIgnoreCase(first12)) ||
                        (Second12 == true && p.Bet[i].equalsIgnoreCase(second12)) ||
                        (Last12 == true && p.Bet[i].equalsIgnoreCase(last12)))

                    p.payTwoTimes();
            }

        }

    }

    public String toString() {
        return "Ethan's American roulette v1.0 Feb 13 2015\n" +
                "Wheel: " + Arrays.toString(numbers);
    }
}
