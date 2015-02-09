/**
 * Created by Yang on 06/02/2015.
 */
public class RegularPlayer extends Player {

    public RegularPlayer(String name, double token, int [] insideBet, String[] outsideBet) {
        super(name,token,insideBet,outsideBet);
        tokenValue = 5;
    }


    public double getTokenValue(){
        return (tokenValue*getToken());
    }



    @Override
    public String toString() {
        return ("Player "+ getName() +", the remaining token number is: "
                + getToken()+".\nThe total value is $" + getTokenValue()+".");
    }
}
