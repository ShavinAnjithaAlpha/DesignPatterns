package patterns.abstract_factory;

// concrete factory for creating pro player objects
public class ProPlayerFactory implements PlayerFactory {

    @Override
    public Warrior createWarrior() {
        return new ArcherWarrior();
    }

    @Override
    public Wizard createWizard() {
        return new CoupledWizard();
    }
}
