package patterns.abstract_factory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        // declare the factory reference and player references
        PlayerFactory playerFactory;
        Warrior warrior;
        Wizard wizard;
        // create an object of concrete factory of basic player factory and pro player factory
        System.out.println("Basic Players:");
        playerFactory = new BasicPlayerFactory();
        warrior = playerFactory.createWarrior();
        warrior.fight();
        warrior.talk();
        System.out.println();

        wizard = playerFactory.createWizard();
        wizard.command();
        wizard.talk();
        System.out.println();

        System.out.println("Pro Players:");
        // create a pro player factory instance
        playerFactory = new ProPlayerFactory();
        warrior = playerFactory.createWarrior();
        warrior.fight();
        warrior.talk();
        System.out.println();

        wizard = playerFactory.createWizard();
        wizard.command();
        wizard.talk();
        System.out.println();


    }
}
