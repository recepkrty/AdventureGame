import java.util.Scanner;

public class Player {
    private int damage;
    private int healthy;
    private int money;
    private String name;
    private String playerName;
    private Inventory inventory;

    public Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public void selectChar(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select your character (1. Samuray 2. Okçu 3. Şövalye ) : ");
        int character = scanner.nextInt();
        switch (character)
        {
            case 1:
                player.setDamage(5);
                player.setHealthy(21);
                player.setMoney(15);
                player.setName("Samuray");
                System.out.println("Samurayı seçtiniz...");
                printCharacter(player);
                break;
            case 2:
                player.setDamage(7);
                player.setHealthy(18);
                player.setMoney(20);
                player.setName("Okçu");
                System.out.println("Okçuyu seçtiniz...");
                printCharacter(player);
                break;
            case 3:
                player.setDamage(8);
                player.setHealthy(24);
                player.setMoney(5);
                player.setName("Şövalye");
                System.out.println("Şövalyeyi seçtiniz...");
                printCharacter(player);
                break;
            default:
                System.out.println("Wrong Choose...!!");
        }
    }

    void selectLoc(){
        Location location = new SafeHouse(this);
        while (location.onLocation())
        {
            System.out.println("1 - Safe House");
            System.out.println("2 - Tool Store");
            System.out.println("3 - Forest");
            System.out.println("4 - Cave");
            System.out.println("5 - River");
            System.out.println("Gitmek istediğiniz yeri seçin: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    location = new SafeHouse(this);
                    break;
                case 2:
                    location = new ToolStore(this);
                    break;
                case 3:
                    location = new Forest(this);
                    break;
                case 4:
                    location = new Cave(this);
                    break;
                case 5:
                    location = new River(this);
                    break;
                default:
                    location = new SafeHouse(this);
            }
        }

    }

    void printCharacter(Player player)
    {
        System.out.println("Karakter Adı: " + player.getName() + "\t\tHasar : "+ player.getDamage()+"\t\tSağlık : "+player.getHealthy()+"\t\tPara : "+player.getMoney());
    }
    public int getDamage() {
        return damage + getInventory().getWeapon().getWeaponDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
