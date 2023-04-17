package patterns.singleton;

public final class Captain3 {

    private static Captain3 captain;
    static int numberOfInstances = 0;

    private Captain3() {
        numberOfInstances++;
        System.out.println("number of instances is " + numberOfInstances);
    }
    // used the double-checked locking mechanism for implement the singleton pattern
    public static Captain3 getCaptain() {

        if (captain == null) {
            synchronized (Captain3.class) {
                if (captain == null) {
                    captain = new Captain3();
                    System.out.println("you have selected the new captain for your team");
                } else {
                    System.out.println("You already have one captain for your team");
                    System.out.println("Use the existing captain");
                }
            }
        }

        return captain;

    }

    public static void main(String[] args) {
        // get the captain instance from getCaptain method
        Captain3 captain1 = Captain3.getCaptain();
        // try to ge another captain instance
        Captain3 captain2 = Captain3.getCaptain();
    }
}
