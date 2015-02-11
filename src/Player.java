import java.util.IntSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class Player {
    private String name;
    private double token;
    protected int tokenValue;
    protected String [] Bet;

    public Player(){
        name = null;
        token = 0;
        tokenValue=0;
        Bet = new String [6];
    }

    public Player(String name, double token, String [] Bet) {
        this.name = name;
        this.token = token;
        this.Bet = Bet;
    }

    public String getName() {
        return name;
    }

    public double getToken() {
        return token;
    }

    public void setToken(double t) {
        token = t + getToken();
    }

    //TODO: implement the payout method.
    public void straight(){
        setToken(35);
    }

    public void split(){
        setToken(17);
    }

    public void street(){
        setToken(11);
    }

    public void square(){
        setToken(8);
    }

    public void topLine(){
        setToken(6);
    }

    public void doubleStreet(){
        setToken(5);
    }

    public static void setBet(Player p){
        Scanner kb = new Scanner(System.in);
        String Bet = kb.nextLine();
        p.Bet = Bet.split(" ");

    }



    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", token=" + token +
                '}';
    }
}
