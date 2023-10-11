import java.util.ArrayList;
import java.util.Random;

public class Deck
{
    ArrayList<Card> cards = new ArrayList<Card>();

    public String toString ()
    {
        return this.cards.toString();
    }
    public void createDeck ()
    {
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"♠", "♥", "♦", "♣"};

        for (int i=0; i <ranks.length; i++)
        {
            for (int j=0; j<suits.length; j++)
            {
                String w = ranks[i];
                String x = suits[j];
                cards.add(new Card(w,x));
                //System.out.println(deck);
            }
        }
    }
    public void shuffle ()
    {
        ArrayList<Card> shuffledCards = new ArrayList<Card>();
        Random rand = new Random();
        int upperbound = cards.size();

        for (int i=0; i < upperbound; i++)
        {
            int randomEntry = rand.nextInt(upperbound-i);
            shuffledCards.add(cards.get(randomEntry));
            cards.remove(randomEntry);
        }
        cards = shuffledCards;
    }
    public ArrayList<Card> dealHand (int numOfCards)
    {
        ArrayList<Card> hand = new ArrayList<Card>();
        for (int i= 0; i < numOfCards; i++)
        {
            hand.add(cards.get(0));
            cards.remove(0);
        }
        return hand;
    }

    public void printOut (){
        System.out.println(1);
    }
}
