
/**
 * Created by Racoonsy on 15-02-04.
 */
public class Dealer {


    public static void main(String[] args) {

        EuropeanRoulette EuroTable = new EuropeanRoulette();
        AmericanRoulette AmerTable = new AmericanRoulette();
        Player[] players = new Player[6];

        Player Lucy = new RegularPlayer("Lucy", 6, new String[6],0);
        Player Nancy = new VipPlayer("Nancy", 10,new String[6],0);
        Player Peter = new RegularPlayer("Peter", 20, new String[6],0);
        Player Jason = new RegularPlayer("Jason", 30, new String[6],0);
        Player Smith = new VipPlayer("Smith", 55, new String[6],0);
        Player Victoria = new RegularPlayer("Victoria", 28, new String[6],0);

        players[0] = Lucy;
        players[1] = Nancy;
        players[2] = Peter;
        players[3] = Jason;
        players[4] = Smith;
        players[5] = Victoria;

        //Open Table, use java.util.Random to chose either European or American Table, then print out.
        Roulette.tableChoice();
        if (Roulette.getTableChoice() == 0) {
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

        //Create an array for holding sorted player.
        //Sort Players, place all VIP players before Regular Players.
        Player[] sortedPlayers = new Player[6];

        //Place VIP Players first.
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

        //Then place Regular Players.
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

        //Ask Player to place bets, then store the bets into a String array.
        //VIP Players bet first, followed by RegularPlayer.
        for(int i=0; i<sortedPlayers.length; i++) {
            if(sortedPlayers[i] instanceof VipPlayer){
                System.out.print("VIP Player, " +sortedPlayers[i].getName()
                    + ", place your bet: ");
                Player.setBet(sortedPlayers[i]);
            }
            else if(sortedPlayers[i] instanceof RegularPlayer){
                System.out.print("Regular Player, " +sortedPlayers[i].getName()
                    + ", place your bet: ");
                Player.setBet(sortedPlayers[i]);
            }

        }

        //Reduce the bet token based on the number of Bets they have placed.
        for(int i = 0; i<sortedPlayers.length; i++){
            if(sortedPlayers[i] instanceof VipPlayer){
                sortedPlayers[i].reduceToken();
                VipPlayer.setReducedToken(sortedPlayers[i]);
            }
            else if(sortedPlayers[i] instanceof RegularPlayer){
                sortedPlayers[i].reduceToken();
                Player.setReducedToken(sortedPlayers[i]);
            }
        }

        //Setting the winning number for the chosen table.
        Roulette.setWinningNumber();
        Roulette.booleanCheck();
        if (Roulette.getTableChoice() == 0) {
            System.out.println("========================================================" +
                        "\nThe winning number is: " + EuroTable.getWinningNumber());
                for(int i=0; i<sortedPlayers.length;i++){
                    Roulette.payOutCalculation(sortedPlayers[i]);
                }
            System.out.println(Lucy.toString());
            System.out.println(Nancy.toString());
            System.out.println(Peter.toString());
            System.out.println(Jason.toString());
            System.out.println(Smith.toString());
            System.out.println(Victoria.toString());
            }
            else {
                System.out.println("========================================================" +
                        "\nThe winning number is: " + AmerTable.getWinningNumber());
                for(int i=0; i<sortedPlayers.length;i++){
                    AmerTable.payOutCalculation(sortedPlayers[i]);
                }
            System.out.println(Lucy.toString());
            System.out.println(Nancy.toString());
            System.out.println(Peter.toString());
            System.out.println(Jason.toString());
            System.out.println(Smith.toString());
            System.out.println(Victoria.toString());
            }

        }

}
