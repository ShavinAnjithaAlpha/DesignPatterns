package patterns.abstract_factory;

public class ArcherWarrior implements Warrior {

    @Override
    public void fight() {
        System.out.println("Archer Warrior fighting...");
    }

    @Override
    public void talk() {
        System.out.println("Archer Warrior talking...");
    }
}
