package chapter14;

import java.util.Random;

/**
 * It should contain a field called side,
 * encapsulation,
 * constant variables for heads and tails,
 * a method called flip(), which randomly chooses heads or tails and assigns that value to side.
 */
public class Coin {
    private String side;
    public static String HEADS = "Heads";
    public static String TAILS = "Tails";
    public String getSide(){
        return side;
    }
    public void setSide(String side){
        this.side=side;
    }
    public String flip(){
        Random random = new Random();
        int headTail = random.nextInt(1);

        if(headTail==0){
            setSide(HEADS);
        } else {
            setSide(TAILS);
        }

        return getSide();
    }
}
