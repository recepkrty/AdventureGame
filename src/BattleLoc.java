import java.util.Random;
import java.util.Scanner;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private int obsNumber;
    public static Random random = new Random();

    public BattleLoc(Obstacle obstacle,Player player,String name, int obsNumber) {
        super(player, name);
        this.obstacle = obstacle;
        this.obsNumber = obsNumber;
    }
    boolean onLocation(){
        System.out.println("Şu an buradasınız : " + this.getName());
        System.out.println("Burada " + this.obsNumber + " tane " + obstacle.getName() + " yaşıyor..!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaçmak için ----> K     V     Savaşmak için ----> S");
        String c = scanner.nextLine();
        c.toUpperCase();
        if (c.equals("S")){
            //combat();
        }
        else{
            System.out.println("Kaçtınız....");
            return true;
        }

        return true;
    }
    void combat(){

    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getObsNumber() {
        return obsNumber;
    }

    public void setObsNumber(int obsNumber) {
        this.obsNumber = obsNumber;
    }
}
