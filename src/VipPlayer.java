/**
 * Created by Yang on 06/02/2015.
 */
public class VipPlayer extends Player{



        public VipPlayer(String name, int token) {
            super(name, token);
            tokenValue = 10;
        }


        public int getTokenValue() {
            return (tokenValue * getToken());
        }

        @Override
        public String toString() {
            return ("VIP Player " + getName() + ", the remaining token number is: "
                    + getToken() + ".\nThe total value is $" + getTokenValue() + ".");
        }
}

