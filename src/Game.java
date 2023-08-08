import java.util.Scanner;

public class Game {

    Player player;
    private Scanner input = new Scanner(System.in);
    public void start()
    {

        System.out.println("Welcome to the game...");
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hoşgeldiniz " + name + "...");
        Player player1 = new Player(name);
        player = player1;
        player.selectChar(player);
        System.out.println("The Game Starting........\n" +
                "************************************");
        player.selectLoc();


    }
}
