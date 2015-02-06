/**
 * Created by Yang on 06/02/2015.
 */
public class RegularPlayer extends Player {

    public RegularPlayer(String name, int token) {
        super(name,token);
        tokenValue = 5;
    }


    public int getTokenValue(){
        return (tokenValue*getToken());
    }



    @Override
    public String toString() {
        return ("Player "+ getName() +", the remaining token number is: "
                + getToken()+".\nThe total value is $" + getTokenValue()+".");
    }
}
