public class River extends BattleLoc{
    public River(Player player) {
        super(new Bear(), player, "River", random.nextInt(2)+1);
    }
}
