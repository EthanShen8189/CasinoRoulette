import java.util.Scanner;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class Player {
    private String name;
    protected double tokenReduction;
    protected double token;
    protected int tokenValue;
    protected String [] Bet;

    public Player(){
        name = null;
        token = 0;
        tokenValue=0;
        Bet = new String [6];
    }

    public Player(String name, double token, String [] Bet,double tokenReduction) {
        this.name = name;
        this.token = token;
        this.Bet = Bet;
        this.tokenReduction = tokenReduction;
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
        token = token + 35;
    }

    public void split(){
        token = token + 17;
    }

    public void street(){
        token = token + 11;
    }

    public void square(){
        token = token + 8;
    }

    public void topLine(){
        token = token + 6;
    }

    public void doubleStreet(){
        token = token + 5;
    }

    public void payOneTime(){
        token = token + 1;
    }

    public void payTwoTimes(){
        token = token + 2;
    }

    public static void setBet(Player p){
        Scanner kb = new Scanner(System.in);
        String Bet = kb.nextLine();
        p.Bet = Bet.split(" ");
    }

    public double reduceToken(){
        for(int i=0;i<Bet.length;i++) {
            if (String.valueOf(Bet[i]) != null) {
                tokenReduction++;
            }
        }
        return tokenReduction;
    }

    public double getTokenReduction() {
        return tokenReduction;
    }

    public static void setReducedToken(Player p){
        p.token = p.token - p.tokenReduction;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", token=" + token +
                '}';
    }
}
