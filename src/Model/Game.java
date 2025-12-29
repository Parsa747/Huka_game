package Model;
import Model.Deck.Deck;
import Model.Deck.Card;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Deck deck;
    private int PlayerTurn;
    private ArrayList<Player> players = new ArrayList<>();


    public Game() {
        deck = new Deck();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("How many Player are in the game?");
            int number = scanner.nextInt();

            if (number > 6 ||  number < 2) {
                System.out.println("Try again!");
            }else{
                for(int i = 0; i < number; i++) {
                    players.add(new Player("player "+i));

                }
                break;
            }
        }
        PlayerInitlizer();


    }

    private void PlayerInitlizer()
    {
        for(Player player: players)
        {
            for(int i =0; i< 4 ; i++){
                player.PlayerReceiveCard(deck.draw());
            }
        }
    }

}
