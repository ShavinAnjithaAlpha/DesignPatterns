package patterns.prototype;

public class Ghost extends Soldier {
    public Ghost(String type) {
        this.type = type;
        healthScore = 90;
        performanceScore = 95;
    }

    @Override
    public Soldier clone() throws CloneNotSupportedException {
        return (Ghost) super.clone();
    }
}
