package patterns.abstract_factory;

public class CoupledWizard implements Wizard {

    @Override
    public void command() {
        System.out.println("Coupled Wizard commanding...");
    }

    @Override
    public void talk() {
        System.out.println("Coupled Wizard talking...");
    }
}
