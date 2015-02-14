/**
 * COMP249 Assignment2 CasinoRoulette-Roulette Class-RegularPlayer
 *
 * This is RegularPlayer Class, this class is the inherited class from Player.
 * @author YangShen(7159390)
 */
public class RegularPlayer extends Player {

    public RegularPlayer(String name, double token, String[] Bet,double tokenReduction) {
        super(name,token,Bet,tokenReduction);
        tokenValue = 5;
    }


    public double getTokenValue(){
        return (tokenValue*getToken());
    }


    /**
     *
     * @return Player's detail.
     */
    @Override
    public String toString() {
        return ("Player "+ getName() +", the remaining token number is: "
                + getToken()+".\nThe total value is $" + getTokenValue()+".");
    }
}
