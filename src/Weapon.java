public class Weapon {
    private String weaponName;
    private int weaponDamage;
    private int money;

    public Weapon(String weaponName, int weaponDamage, int money) {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.money = money;
    }
    public Weapon(){
        this.weaponName = "Yumruk";
        this.weaponDamage = 0;
        this.money = 0;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
