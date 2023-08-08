public class Forest extends BattleLoc{
    public Forest() {
        super(new Vampire());
    }

    @Override
    boolean onLocation() {
        return false;
    }

    @Override
    void combat() {

    }
}
