package Model;
import Model.Deck.Deck;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Deck deck;
    private int PlayerTurn;
    private ArrayList<Player> players = new ArrayList<>();


    public Game()
    {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("How many Player are in the game?");
            int number = scanner.nextInt();
            if (number >= 6 &&  number <= 2) {
                System.out.println("Try again!");
                break;
            };
        }
        InitilizeAllPlayers();


    }

    private void InitilizeAllPlayers()
    {
        for(Player player: players)
        {
            player.PlayerInitializer(new ArrayList<>(java.util.Arrays.asList(
                    deck.draw(), deck.draw(), deck.draw().faceUp(), deck.draw().faceUp()
            )));
        }




    }

}
