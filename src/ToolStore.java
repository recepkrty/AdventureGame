import java.util.Scanner;

public class ToolStore extends NormalLoc{

    private Armor[] armors = {new Hafif(),new Orta(), new Agır()};
    private Weapon[] weapons = {new Tabanca(), new Kılıc(), new Tufek()};
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    boolean onLocation() {
        System.out.println("You're in Tool Store...");
        menu();
        return true;
    }
    void menu(){
        System.out.println("Mağazaya Hoşgeldiniz....");
        System.out.println("----------------SILAHLAR----------------");
        for (Weapon w:
             weapons) {
            System.out.println("Ad: " + w.getWeaponName() + "\t\tHasar: " + w.getWeaponDamage() + "\t\tPara: " + w.getMoney());
        }
        System.out.println("----------------ZIRHLAR----------------");
        for (Armor a:
                armors) {
            System.out.println("Ad: " + a.getArmorName() + "\t\tEngelleme: " + a.getArmorDefence() + "\t\tPara: " + a.getMoney());
        }
        System.out.println("Bakiye :  " + getPlayer().getMoney());
        System.out.println("Çıkmak için 0' a ya da satın almak için numarasına basınız...");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s == 0)
            System.out.println("Mağazadan Çıkıldı....");
        else{
            while(buy(s)){
                s = scanner.nextInt();
                if (s == 0){
                    System.out.println("Mağazadan Çıkıldı.....");
                    break;
                }
            }
        }
    }

    boolean buy(int s){
        if(s <= 3){
            if (getPlayer().getMoney() >= weapons[s-1].getMoney()){
                getPlayer().setMoney(getPlayer().getMoney() - weapons[s-1].getMoney());
                System.out.println("-----Satın Alındı------>  " + weapons[s-1].getWeaponName());
                getPlayer().getInventory().setWeapon(weapons[s-1]);
                return false;
            }
            else{
                System.out.print("Yetersiz Bakiye....Tekrar deneyin ya da çıkmak için 0' a basın...");
                return true;
            }
        }
        else{
            if (getPlayer().getMoney() >= armors[s-4].getMoney()){
                getPlayer().setMoney(getPlayer().getMoney() - armors[s-4].getMoney());
                System.out.println("-----Satın Alındı------>  " + armors[s-4].getArmorName());
                getPlayer().getInventory().setArmor(armors[s-4]);
                return false;
            }
            else{
                System.out.print("Yetersiz Bakiye....Tekrar deneyin ya da çıkmak için 0' a basın...");
                return true;
            }
        }
    }
}
