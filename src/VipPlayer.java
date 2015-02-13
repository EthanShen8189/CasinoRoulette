/**
 * Created by Yang on 06/02/2015.
 */
public class VipPlayer extends Player{


        public VipPlayer(String name, double token, String[] Bet,double tokenReduction) {
            super(name, token,Bet,tokenReduction);
            tokenValue = 10;
        }


        public double getTokenValue() {
            return (tokenValue * getToken());
        }

    @Override
    public void straight(Player p){
        p.token = p.token + 35*1.1;
        System.out.println("It's a Straight! Congratulation! VIP Player " + p.getName()+" won 35 tokens!");
    }

    @Override
    public void split(Player p){
        p.token = p.token + 17*1.1;
        System.out.println("It's a Split! Congratulation! VIP Player " + p.getName()+" won 17 tokens!");
    }

    @Override
    public void street(Player p){
        p.token = p.token + 11*1.1;
        System.out.println("It's a Street! Congratulation! VIP Player " + p.getName()+" won 11 tokens!");
    }

    @Override
    public void square(Player p){
        p.token = p.token + 8*1.1;
        System.out.println("It's a Square! Congratulation! VIP Player " + p.getName()+" won 8 tokens!");
    }

    @Override
    public void topLine(Player p){
        p.token = p.token + 6*1.1;
        System.out.println("It's a TopLine! Congratulation! VIP Player " + p.getName()+" won 6 tokens!");
    }

    @Override
    public void doubleStreet(Player p){
        p.token = p.token + 5*1.1;
        System.out.println("It's a DoubleStreet! Congratulation! VIP Player " + p.getName()+" won 5 tokens!");
    }

    @Override
    public void payOneTime(Player p){
        p.token = p.token + 1.1;
        System.out.println("Congratulation! VIP Player " + p.getName()+" won 1 token!");
    }

    @Override
    public void payTwoTimes(Player p){
        p.token = p.token + 2*1.1;
        System.out.println("It's a Square! Congratulation! VIP Player " + p.getName()+" won 2 tokens!");
    }


    public double reduceToken() {
        for(int i=0;i<Bet.length;i++) {
            if (Bet[i] != null) {
                tokenReduction++;
            }
        }
        return tokenReduction;
    }

    public static void setReducedToken(Player p){
        p.token = p.token - p.tokenReduction*0.95;
    }

    @Override
        public String toString() {
            return ("VIP Player " + getName() + ", the remaining token number is: "
                    + getToken() + ".\nThe total value is $" + getTokenValue() + ".");
        }
}

