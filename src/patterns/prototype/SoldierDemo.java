package patterns.prototype;

public class SoldierDemo {

    public static void main(String[] args) throws CloneNotSupportedException{
        // create a Sniper
        Sniper generalSniper = new Sniper("General Sniper");

        // create a ghost soldier
        Ghost maxGhost = new Ghost("Max Ghost");
        maxGhost.performanceScore = 100;

        // declare a soldier
        Soldier soldier1;

        // clone the ghost to soldier1
        soldier1 = maxGhost.clone();
        System.out.println("Soldier1\n" + soldier1);

        Soldier soldier2 = generalSniper.clone();
        System.out.println("Soldier2\n" + soldier2);

    }
}
