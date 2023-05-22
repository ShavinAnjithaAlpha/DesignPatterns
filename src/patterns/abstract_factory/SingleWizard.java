package patterns.abstract_factory;

public class SingleWizard implements Wizard {

    @Override
    public void command() {
        System.out.println("Single Wizard commanding...");
    }

    @Override
    public void talk() {
        System.out.println("Single wizard talking...");
    }
}
