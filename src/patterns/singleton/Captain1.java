package patterns.singleton;

public final class Captain1 {
    // Early initialization
    private static final Captain1 captain = new Captain1();

    private Captain1() {
        System.out.println("You have selected the captain for your team");
    }

    public static Captain1 getCaptain() {
        System.out.println("You have captain for your team");
        return captain;
    }

    public static void printMessage() {
        System.out.println("this is the message");
    }

    public static void main(String[] args) {
        Captain1.printMessage();
        // use get method for access the global captain instance
        Captain1 captain = Captain1.getCaptain();
        Captain1 captain2 = Captain1.getCaptain();

        if (captain2 == captain) {
            System.out.println("captain and captain2 are equal");
        }
    }
}
