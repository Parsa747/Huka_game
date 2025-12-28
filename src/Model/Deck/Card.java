package Model.Deck;

public class Card {
    private final String name;
    private final int value;
    private boolean faceup;
    public Card(String name, int value){
        this.name = name;
        this.value = value;
        this.faceup = false;
    }

    public boolean faceUp(){
        if(this.faceup) return true;
        return false;
    }
    public int getValue(){
        return this.value;
    }

}
