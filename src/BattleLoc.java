import java.util.Random;
import java.util.Scanner;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private int obsNumber;
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public BattleLoc(Obstacle obstacle,Player player,String name, int obsNumber) {
        super(player, name);
        this.obstacle = obstacle;
        this.obsNumber = obsNumber;
    }
    boolean onLocation(){
        System.out.println("Şu an buradasınız : " + this.getName());
        System.out.println("Burada " + this.obsNumber + " tane " + obstacle.getName() + " yaşıyor..!");
        System.out.println("Kaçmak için ----> K     V     Savaşmak için ----> S");
        String c = scanner.nextLine().toUpperCase();
        if (c.equals("S")){
            return combat();
        }
        else{
            System.out.println("Kaçtınız....");
            return true;
        }
    }
    boolean combat(){
        int obsHeal = this.obstacle.getHealth();
        for (int i = 0; i < this.obsNumber; i++){
            while(this.getPlayer().getHealthy() > 0 && this.obstacle.getHealth() > 0){
                this.getPlayer().printCharacter(this.getPlayer());
                System.out.println(this.obstacle.getName() + "----->  Kalan Canı : " + this.obstacle.getHealth() + " Hasar : " + this.obstacle.getDamage());
                System.out.println("Kaçmak için ----> K     V     Savaşmak için ----> S");
                String c = scanner.nextLine().toUpperCase();
                if (c.equals("S")){
                    this.obstacle.setHealth(getObstacle().getHealth() - this.getPlayer().getDamage());
                    System.out.println(this.getPlayer().getDamage() + " Hasar Verdiniz....");
                    if (this.obstacle.getHealth() <= 0){
                        System.out.println(this.obstacle.getName() + " Öldü...");
                        this.getPlayer().setMoney(getPlayer().getMoney() + this.obstacle.getMoney());
                        if(i+1 != this.obsNumber){
                            System.out.println("Kalan Canavar Sayısı : " + (this.obsNumber - (i+1)));
                            this.obstacle.setHealth(obsHeal);
                        }
                        else{
                            System.out.println("Bölümü geçtiniz....");
                            System.out.println("Ödülü Aldınız.....");
                            return true;
                        }
                    }
                    else{
                        int obsDamage = this.obstacle.getDamage() - this.getPlayer().getInventory().getArmor().getArmorDefence();
                        if (obsDamage < 0)
                            obsDamage = 0;
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy() - obsDamage);
                        System.out.println(obsDamage + " Hasar Yediniz....");
                        if (this.getPlayer().getHealthy() <= 0){
                            System.out.println("Öldünüz....");
                            return false;
                        }
                    }
                }
                else{
                    System.out.println("Kaçtınız....");
                    return true;
                }
            }
        }
        return true;
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
