public abstract class BattleLoc {
    Obstacle obstacle;

    public BattleLoc(Obstacle obstacle) {
        this.obstacle = obstacle;
    }
    abstract boolean onLocation();
    abstract void combat();
}
