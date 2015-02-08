
import java.util.Random;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class Dealer {



    public static void main(String[] args){

        EuropeanRoulette EuroTable = new EuropeanRoulette();
        AmericanRoulette AmerTable = new AmericanRoulette();
        Player [] players = new Player [6];

        Player Lucy = new RegularPlayer("Lucy",6, null, null);
        Player Nancy = new VipPlayer("Nancy",10, null, null);
        Player Peter = new RegularPlayer("Peter",20,null,null);
        Player Jason = new RegularPlayer("Jason",30,null,null);
        Player Smith = new VipPlayer("Smith",55,null,null);
        Player Victoria = new RegularPlayer("Victoria", 28,null,null);

        players[0] = Lucy;
        players[1] = Nancy;
        players[2] = Peter;
        players[3] = Jason;
        players[4] = Smith;
        players[5] = Victoria;

        Random tableChoice = new Random();
        int table = tableChoice.nextInt(2);

        if(table==0) {
            System.out.println(EuroTable.toString());
        }
        else {
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

        Player [] sortedPlayers = new Player[6];
        int j=0;
        for(int i=0; i<players.length;i++){
            if(players[i] instanceof VipPlayer){
                sortedPlayers[j] = players[i];
            }
        }
        j++;


        for(int i=j; i<sortedPlayers.length;j++){
            if(players[i] instanceof RegularPlayer){
                sortedPlayers[j] = players[i];
            }
        }



        if(table==0)
            EuroTable.setWinningNumber();

        else
            AmerTable.setWinningNumber();

        System.out.println("========================================================" +
                "\nThe winning number is: " + AmerTable.getWinningNumber());


    }



}
