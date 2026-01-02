package Model.Deck;
import java.util.Random;
import java.util.Stack;
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
            // 11: Jack, 12: Queen, 13: King
            for (int i = 1; i<14; i++){
                Card theCard = new Card(name, i);
                cards.add(theCard);
            }
        }
    }
    Stack<Card> theStack = new Stack<>();
    public Card draw() {


        if(this.cards.isEmpty()){
            for (Card c : theStack) {
                this.cards.add(c);
            }
        }
        Random random = new Random();
        int randomOneBased = random.nextInt(this.cards.size()) + 1;
        Card SelectedCard = this.cards.get(randomOneBased);
        cards.remove(SelectedCard);
        return SelectedCard;

    }
}
