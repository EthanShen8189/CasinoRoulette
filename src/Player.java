import java.text.DecimalFormat;
import java.util.DoubleSummaryStatistics;
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
        double formattedToken;
        DecimalFormat decim = new DecimalFormat("#.##");
        formattedToken = Double.parseDouble(decim.format(token));
        return formattedToken;
    }

    public void straight(Player p){
        p.token = p.token + 1+ 35;
        System.out.println("Congratulation! " + p.getName()+" won 35 tokens!");
    }

    public void split(Player p){
        p.token = p.token + 17 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 17 tokens!");
    }

    public void street(Player p){
        p.token = p.token + 11 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 11 tokens!");
    }

    public void square(Player p){
        p.token = p.token + 8 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 8 tokens!");
    }

    public void topLine(Player p){
        p.token = p.token + 6 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 6 tokens!");
    }

    public void doubleStreet(Player p){
        p.token = p.token + 5 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 5 tokens!");
    }

    public void payOneTime(Player p){
        p.token = p.token + 1 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 1 token!");
    }

    public void payTwoTimes(Player p){
        p.token = p.token + 2 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 2 tokens!");
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
