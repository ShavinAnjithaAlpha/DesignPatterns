package patterns.prototype;

public abstract class Soldier implements Cloneable{

    public String type;
    public int healthScore, performanceScore;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Soldier clone() throws CloneNotSupportedException {
        return (Soldier) super.clone();
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nHealth: %d%nPerformance: %d%n", type, healthScore, performanceScore);
    }
}
