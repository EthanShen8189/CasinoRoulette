import java.util.Scanner;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class Player {
    private String name;
    private double token;
    protected int tokenValue;
    protected int [] insideBet;
    protected String [] outsideBet;

    public Player(){
        name = null;
        token = 0;
        tokenValue=0;
        insideBet = new int [6];
        outsideBet = new String [6];
    }

    public Player(String name, double token, int[] insideBet, String [] outsideBet) {
        this.name = name;
        this.token = token;
        this.insideBet = insideBet;
        this.outsideBet = outsideBet;
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




    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", token=" + token +
                '}';
    }
}
