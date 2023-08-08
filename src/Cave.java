public class Cave extends BattleLoc{

    public Cave(Player player) {
        super(new Zombie(), player, "Cave", random.nextInt(3)+1);
    }
}
