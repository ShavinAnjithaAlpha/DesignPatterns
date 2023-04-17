package patterns.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        // get the captain instance
        Captain captain1 = Captain.getCaptain();
        // try to create another captain instance using getCaptain()
        Captain captain2 = Captain.getCaptain();

        // checking for equality of the captain1 and captain 2
        if (captain1 == captain2) {
            System.out.println("captain1 is equal to the captain2");
        } else {
            System.out.println("captain1 is not equal to the captain2");
        }
    }
}
