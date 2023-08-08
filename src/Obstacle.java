public class Obstacle {
    private int damage;
    private int health;
    private int money;

    public Obstacle(int damage, int health, int money) {
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    static int obstacleNumber(){
        return (int) Math.random()*4;
    }
}
