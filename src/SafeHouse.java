public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    boolean onLocation() {
        System.out.println("You're in safe house...");
        System.out.println("Your health is full...");
        return true;
    }
}
