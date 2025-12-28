package Model.Deck;
import java.util.Random;
import java.util.random.*;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }
    public void creatDeck()
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("King");
        names.add("Queen");
        names.add("Soldiers");

        for(String name: names){
            for(int i = 1; i <= 10; i++){

                cards.add(new Card(name,i));
            }
        }
        cards.add(new Card("Jocker",-1));
        cards.add(new Card("Jocker",-1));


    }
    public Card draw()
    {

        Random random = new Random();
        int randomZeroBased = random.nextInt(this.cards.size());
        int randomOneBased = randomZeroBased + 1;

        return this.cards.get(randomZeroBased);

    }
}
