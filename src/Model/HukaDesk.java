package Model;
import Model.Deck.Deck;
import Model.Deck.Card;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class HukaDesk {
    private int turn;
    private Deck deck;
    public static int PlayerTurn;
    private ArrayList<Player> players = new ArrayList<>();
    public static int NumberOfPlayer;
    private Stack<Card> stackCard = new Stack<>();


    public HukaDesk() {

    }

    public boolean MoveOptions(Player player){
        Card card = deck.draw();
        Scanner scanner = new Scanner(System.in);
        System.out.print("discard (d), change (c): ");
        String name = scanner.nextLine(); // Step 3: Use nextLine()
        if(name == "d")
        {
            stackCard.add(card);
        }
        if(name == "c")
        {
            for(Card c: player.getPlayerCards())
            {
                System.out.println(c);

            }
             scanner = new Scanner(System.in);
            System.out.print("which index: ");
            int index = scanner.nextInt();
            if(index < player.getPlayerCards().size())
            {
                player.getPlayerCards().remove(index);
                player.getPlayerCards().add(index, card);
            }
            index +=1;
        }
    }

}
