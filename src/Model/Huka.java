package Model;

public class Huka  {
    private HukaDesk hukadesk = new HukaDesk();
    private int Whosturn = HukaDesk.PlayerTurn;
    private int NumberofPlayer = hukadesk.NumberOfPlayer;


    private  int OtherPlayer(int p)
    {
        if(Whosturn%NumberofPlayer == 0)
        {
            return 1;
        }else{
            Whosturn += 1;
            return Whosturn;
        }
    }

}
