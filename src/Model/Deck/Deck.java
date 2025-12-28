package Model.Deck;
import java.util.Random;
import java.util.random.*;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
        ArrayList<String> signs = new ArrayList<>();
        signs.add("Spade");
        signs.add("Club");
        signs.add("Heart");
        signs.add("Diamond");

        for (String name: signs){
            for (int i = 1; i<11; i++){
                Card theCard = new Card(name, i);
                cards.add(theCard);
            }
        }
    }
    public Card draw()
    {
        if(this.cards.isEmpty()){
            System.out.println("The deck is empty");
            return new Card("0",0);
        }
        Random random = new Random();
        int randomZeroBased = random.nextInt(this.cards.size());
        int randomOneBased = randomZeroBased + 1;
        Card SelectedCard = this.cards.remove(randomOneBased);
        return SelectedCard;

    }
}
