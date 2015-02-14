import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * COMP249 Assignment2 CasinoRoulette-Player Class
 * @author YangShen(7159390)
 * This is Player Class, this class is the super class of all Player object.
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

    /**
     * This method accesses player's name.
     * @return The name of Player
     */
    public String getName() {
        return name;
    }

    /**
     * This method accesses the remaining token of a Player.
     * The method also formats the double number to two place after decimal.
     * @return The token number(after two decimal place)
     */
    public double getToken() {
        double formattedToken;
        DecimalFormat decim = new DecimalFormat("#.##");
        formattedToken = Double.parseDouble(decim.format(token));
        return formattedToken;
    }

    /**
     * This method set the winning token to +35.
     * @param p the player who is about to get the winning
     */
    public void straight(Player p){
        p.token = p.token + 1+ 35;
        System.out.println("Congratulation! " + p.getName()+" won 35 tokens!");
    }

    /**
     * This method set the winning token to +17.
     * @param p the player who is about to get the winning
     */
    public void split(Player p){
        p.token = p.token + 17 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 17 tokens!");
    }

    /**
     * This method set the winning token to +11.
     * @param p the player who is about to get the winning
     */
    public void street(Player p){
        p.token = p.token + 11 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 11 tokens!");
    }

    /**
     * This method set the winning token to +8.
     * @param p the player who is about to get the winning
     */
    public void square(Player p){
        p.token = p.token + 8 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 8 tokens!");
    }

    /**
     * This method set the winning token to +6.
     * @param p the player who is about to get the winning
     */
    public void topLine(Player p){
        p.token = p.token + 6 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 6 tokens!");
    }

    /**
     * This method set the winning token to +5.
     * @param p the player who is about to get the winning
     */
    public void doubleStreet(Player p){
        p.token = p.token + 5 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 5 tokens!");
    }

    /**
     * This method set the winning token to +1.
     * @param p the player who is about to get the winning
     */
    public void payOneTime(Player p){
        p.token = p.token + 1 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 1 token!");
    }

    /**
     * This method set the winning token to +2.
     * @param p the player who is about to get the winning
     */
    public void payTwoTimes(Player p){
        p.token = p.token + 2 + 1;
        System.out.println("Congratulation! " + p.getName()+" won 2 tokens!");
    }

    /**
     * This method takes the inputs from keyboard and store them into Bet array.
     * Each separated input(by space) is stored in one array space.
     * @param p the player who is about to set the bet.
     */
    public static void setBet(Player p){
        Scanner kb = new Scanner(System.in);
        String Bet = kb.nextLine();
        p.Bet = Bet.split(" ");
    }

    /**
     * This method checks the elements from Player.Bet[].
     * For each element, player's token reduced by 1.
     * @return the number of token is about to reduced.
     */
    public double reduceToken(){
        for(int i=0;i<Bet.length;i++) {
            if (String.valueOf(Bet[i]) != null) {
                tokenReduction++;
            }
        }
        return tokenReduction;
    }

    /**
     * This method accesses the value of tokenReduction.
     * @return the number of reduced token.
     */
    public double getTokenReduction() {
        return tokenReduction;
    }

    /**
     * This method mutates player's token number.
     * @param p the player who is about to set the new token number after bet.
     */
    public static void setReducedToken(Player p){
        p.token = p.token - p.tokenReduction;
    }

    /**
     *
     * @return Player's detail.
     */
    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", token=" + token +
                '}';
    }
}
