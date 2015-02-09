
import java.util.Random;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class Dealer {


    public static void main(String[] args) {

        EuropeanRoulette EuroTable = new EuropeanRoulette();
        AmericanRoulette AmerTable = new AmericanRoulette();
        Player[] players = new Player[6];

        Player Lucy = new RegularPlayer("Lucy", 6, new int[6], new String[6]);
        Player Nancy = new VipPlayer("Nancy", 10,new int[6], new String[6]);
        Player Peter = new RegularPlayer("Peter", 20, new int[6], new String[6]);
        Player Jason = new RegularPlayer("Jason", 30, new int[6], new String[6]);
        Player Smith = new VipPlayer("Smith", 55, new int[6], new String[6]);
        Player Victoria = new RegularPlayer("Victoria", 28, new int[6], new String[6]);

        players[0] = Lucy;
        players[1] = Nancy;
        players[2] = Peter;
        players[3] = Jason;
        players[4] = Smith;
        players[5] = Victoria;

        Random selectTable = new Random();
        int tableChoice = selectTable.nextInt(2);

        if (tableChoice == 0) {
            System.out.println(EuroTable.toString());
        } else {
            System.out.println(AmerTable.toString());
        }

        System.out.println(Lucy.toString());
        System.out.println(Nancy.toString());
        System.out.println(Peter.toString());
        System.out.println(Jason.toString());
        System.out.println(Smith.toString());
        System.out.println(Victoria.toString());

        //TODO:ExceptionHanding,dealer open the table,ask user to input bets,calculate winning,return winning,close the table.
        System.out.println("VIP player, Please place your bet....");

        Player[] sortedPlayers = new Player[6];
        int index =0;
        for (int i = 0; i < players.length; i++) {
            for(int j =0; j<sortedPlayers.length;j++) {
                if (players[i] instanceof VipPlayer){
                    sortedPlayers[index] = players[i];
                    i++;
                    index++;
                }
                else
                    continue;
            }
        }


        for (int i = 0; i < players.length; i++) {
            for(int j =index; j<sortedPlayers.length;j++) {
                if (players[i] instanceof RegularPlayer){
                    sortedPlayers[index] = players[i];
                    i++;
                    index++;
                }
                else
                    continue;
            }
        }
                /*System.out.println(sortedPlayers[j].getName() + ": ");
                System.out.print(sortedPlayers[j].getName()
                        + ", place your inside table bet(inputs must be integer): ");
                sortedPlayers[j].setInsideBet();
                System.out.print(sortedPlayers[j].getName()
                        + ", place your outside table bet(inputs must be word): ");
                sortedPlayers[j].setOutsideBet();*/
            /*}
        }

        for(int i=0;i <sortedPlayers.length; i++){
            System.out.println(sortedPlayers[i].toString());
        }

        for (int i = 0; i < players.length; i++) {
            System.out.print(sortedPlayers[i].getName()
                    + ", place your inside table bet(the input must be an integer): ");
            Roulette.setInsideBet(sortedPlayers[i]);
            System.out.print(sortedPlayers[i].getName()
                    + ", place your outside table bet(the input must be a word): ");
            Roulette.setOutsideBet(sortedPlayers[i]);
        }



            if (tableChoice == 0)
                EuroTable.setWinningNumber();

            else
                AmerTable.setWinningNumber();

            System.out.println("========================================================" +
                    "\nThe winning number is: " + AmerTable.getWinningNumber());*/


        }



}
