package patterns.singleton;

public final class Captain {
    // use private constructor to avoid use 'new' operator by user
    private static Captain captain;
    private Captain() {}

    // use the lazy initialization
    public static synchronized Captain getCaptain() {

        if (captain == null) {
            captain = new Captain();
            System.out.println("captain has selected for the team");

        } else {
            System.out.println("You already have captain");
            System.out.println("use the existing captain for the task");
        }

        return captain;

    }

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
