
/**
 * COMP249 Assignment2 CasinoRoulette-Roulette Class-VipPlayer
 *
 * This is VipPlayer Class, this class is the inherited class from Player.
 * @author YangShen(7159390)
 */
public class VipPlayer extends Player{


        public VipPlayer(String name, double token, String[] Bet,double tokenReduction) {
            super(name, token,Bet,tokenReduction);
            tokenValue = 10;
        }


        public double getTokenValue() {
            return (tokenValue * getToken());
        }

    /**
     * The method is overridden from its super class. VipPlayer gets 10% bonus.
     * @param p the player who is about to get the winning
     */
    @Override
    public void straight(Player p){
        p.token = p.token + 35*1.1;
        System.out.println("Congratulation! VIP Player " + p.getName()+" won 35 tokens!");
    }

    /**
     * The method is overridden from its super class. VipPlayer gets 10% bonus.
     * @param p the player who is about to get the winning
     */
    @Override
    public void split(Player p){
        p.token = p.token + 17*1.1;
        System.out.println("Congratulation! VIP Player " + p.getName()+" won 17 tokens!");
    }

    /**
     * The method is overridden from its super class. VipPlayer gets 10% bonus.
     * @param p the player who is about to get the winning
     */
    @Override
    public void street(Player p){
        p.token = p.token + 11*1.1;
        System.out.println("Congratulation! VIP Player " + p.getName()+" won 11 tokens!");
    }

    /**
     * The method is overridden from its super class. VipPlayer gets 10% bonus.
     * @param p the player who is about to get the winning
     */
    @Override
    public void square(Player p){
        p.token = p.token + 8*1.1;
        System.out.println("Congratulation! VIP Player " + p.getName()+" won 8 tokens!");
    }

    /**
     * The method is overridden from its super class. VipPlayer gets 10% bonus.
     * @param p the player who is about to get the winning
     */
    @Override
    public void topLine(Player p){
        p.token = p.token + 6*1.1;
        System.out.println("Congratulation! VIP Player " + p.getName()+" won 6 tokens!");
    }

    /**
     * The method is overridden from its super class. VipPlayer gets 10% bonus.
     * @param p the player who is about to get the winning
     */
    @Override
    public void doubleStreet(Player p){
        p.token = p.token + 5*1.1;
        System.out.println("Congratulation! VIP Player " + p.getName()+" won 5 tokens!");
    }

    /**
     * The method is overridden from its super class. VipPlayer gets 10% bonus.
     * @param p the player who is about to get the winning
     */
    @Override
    public void payOneTime(Player p){
        p.token = p.token + 1.1;
        System.out.println("Congratulation! VIP Player " + p.getName()+" won 1 token!");
    }

    /**
     * The method is overridden from its super class. VipPlayer gets 10% bonus.
     * @param p the player who is about to get the winning
     */
    @Override
    public void payTwoTimes(Player p){
        p.token = p.token + 2*1.1;
        System.out.println("Congratulation! VIP Player " + p.getName()+" won 2 tokens!");
    }

    /**
     * This method mutates VipPlayer's token number, each time a VipPlayer places a bet, 5% of token value is returned.
     * @param p the player who is about to set the new token number after bet.
     */
    public static void setReducedToken(Player p){
        p.token = p.token - p.tokenReduction*0.95;
    }

    /**
     *
     * @return Player's detail.
     */
    @Override
        public String toString() {
            return ("VIP Player " + getName() + ", the remaining token number is: "
                    + getToken() + ".\nThe total value is $" + getTokenValue() + ".");
        }
}

