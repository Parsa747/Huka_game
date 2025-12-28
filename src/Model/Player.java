package Model;


import Model.Deck.Card;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> playerCards;
    private String name;
    private int playerHandValue;

    public Player(String name)
    {
        playerCards = new ArrayList<>();
        this.name = name;
        this.playerHandValue = 0;

    }
    public void PlayerInitializer(Card card)
    {
        this.playerCards.add(card);
    }
    public int GetPlayerCardValues(){
        int sum = 0;
        for(Card card: this.playerCards){
            sum += card.getValue();
        }
        return sum;
    }

    public void PlayerReceiveCard(Card card)
    {
        this.playerCards.add(card);
    }
    public void PLayerRemoveCard(Card card)
    {
        int cardValue = card.getValue();
        for(Card card1 : this.playerCards)
        {
            if(card1.getValue() == cardValue){
                this.playerCards.remove(card);
                break;
            }

        }
    }



}
