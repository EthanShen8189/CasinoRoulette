import java.util.Scanner;

/**
 * Created by Racoonsy on 15-02-04.
 */
public class Player {
    private String name;
    private int token;
    protected int tokenValue;
    private int [] insideBet;
    private String [] outsideBet;

    public Player(){
        name = null;
        token = 0;
        tokenValue=0;
        insideBet = new int [6];
        outsideBet = new String [6];

    }

    public Player(String name, int token, int [] insideBet, String[] outsideBet) {
        this.name = name;
        this.token = token;
        this.insideBet = insideBet;
        this.outsideBet = outsideBet;
    }

    public String getName() {
        return name;
    }

    public void setInsideBet(){
        Scanner kb = new Scanner(System.in);
        for(int j =0; j<insideBet.length; j++){
            insideBet[j] = kb.nextInt();
        }
    }

    public void setOutsideBet(){
        Scanner kb = new Scanner(System.in);
        for(int j =0; j<outsideBet.length; j++){
            outsideBet[j] = kb.nextLine();
        }
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    //TODO: implement the payout method.

    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", token=" + token +
                '}';
    }
}
