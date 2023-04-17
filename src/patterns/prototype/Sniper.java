package patterns.prototype;

public class Sniper extends Soldier {
    public Sniper(String type) {
        this.type = type;
        healthScore = 100;
        performanceScore = 80;
    }

    @Override
    public Soldier clone() throws CloneNotSupportedException {
        return (Sniper) super.clone();
    }

}
