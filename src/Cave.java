public class Cave extends BattleLoc{

    public Cave() {
        super(new Zombie());
    }

    @Override
    boolean onLocation() {
        return false;
    }

    @Override
    void combat() {

    }
}
