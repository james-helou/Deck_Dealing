import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        Deck d1 = new Deck();
        d1.createDeck();
        System.out.println(d1);
        d1.shuffle();
        System.out.println(d1);
        System.out.println(d1.dealHand(13));
        System.out.println(d1.dealHand(13));
        System.out.println(d1.dealHand(13));
        System.out.println(d1.dealHand(13));
    }
}
