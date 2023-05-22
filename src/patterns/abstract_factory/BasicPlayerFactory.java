package patterns.abstract_factory;

// concrete player factory
public class BasicPlayerFactory implements PlayerFactory {

    @Override
    public Warrior createWarrior() {
        return new HammerWarrior();
    }

    @Override
    public Wizard createWizard() {
        return new SingleWizard();
    }
}
