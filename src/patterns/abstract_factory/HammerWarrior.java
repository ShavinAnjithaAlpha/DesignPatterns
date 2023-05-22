package patterns.abstract_factory;

public class HammerWarrior implements Warrior {

    @Override
    public void fight() {
        System.out.println("Hammer Warrior fighting...");
    }

    @Override
    public void talk() {
        System.out.println("Hammer Warrior Talking...");
    }
}
