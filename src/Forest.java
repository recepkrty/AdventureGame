public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(new Vampire(), player, "Forest", random.nextInt(3)+1);
    }
}
