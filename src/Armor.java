public class Armor {
    private String armorName;
    private int armorDefence;
    private int money;

    public Armor(String armorName, int armorDefence, int money) {
        this.armorName = armorName;
        this.armorDefence = armorDefence;
        this.money = money;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}