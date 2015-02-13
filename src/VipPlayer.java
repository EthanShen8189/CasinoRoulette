/**
 * Created by Yang on 06/02/2015.
 */
public class VipPlayer extends Player{


        public VipPlayer(String name, double token, String[] Bet) {
            super(name, token,Bet);
            tokenValue = 10;
            tokenReduction =0;
        }


        public double getTokenValue() {
            return (tokenValue * getToken());
        }

    @Override
    public void straight() {
        setToken(getToken()+35*1.1);
    }

    @Override
    public void split() {
        setToken(getToken() + 17 * 1.1);
    }

    @Override
    public void street() {
        setToken(getToken() + 11 * 1.1);
    }

    @Override
    public void square() {
        setToken(getToken() + 8 * 1.1);
    }

    @Override
    public void topLine() {
        setToken(getToken() + 6 * 1.1);
    }

    @Override
    public void doubleStreet() {
        setToken(getToken() + 5 * 1.1);
    }

    @Override
    public double reduceToken() {
        for(int i=0;i<Bet.length;i++) {
            if (Bet[i] != null) {
                tokenReduction++;
            }
        }
        return tokenReduction * .95;
    }

    @Override
        public String toString() {
            return ("VIP Player " + getName() + ", the remaining token number is: "
                    + getToken() + ".\nThe total value is $" + getTokenValue() + ".");
        }
}

