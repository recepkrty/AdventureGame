public class River extends BattleLoc{
    public River() {
        super(new Bear());
    }

    @Override
    boolean onLocation() {
        return false;
    }

    @Override
    void combat() {

    }
}
