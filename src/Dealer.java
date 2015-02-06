/**
 * Created by Racoonsy on 15-02-04.
 */
public class Dealer {
    public static void main(String[] args){

        Player Lucy = new RegularPlayer("Lucy",6);
        Player Nancy = new VipPlayer("Nancy",10);
        System.out.println(Lucy.toString());
        System.out.println(Nancy.toString());
        /*EuropeanRoulette object = new EuropeanRoulette();
        System.out.print(object);*/
    }


}
