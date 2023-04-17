package patterns.singleton;

public final class Captain2 {

    private Captain2() {
        System.out.println("You have created the Captain for your team");
    }
    // nested class referenced after getCaptain() method invoked
    private static class CaptainHelper {
        private static final Captain2 captain = new Captain2();
    }

    public static Captain2 getCaptain() {
        return CaptainHelper.captain;
    }

    public static void printMessage() {
        System.out.println("this is the message");
    }

    public static void main(String[] args) {
        // called to captain class printMessage method
        Captain2.printMessage();
        // get the captain instance
        Captain2 captain = Captain2.getCaptain();
        Captain2 captain1 = Captain2.getCaptain();

        if (captain == captain1) {
            System.out.println("captain and captain2 is equal");
        }
    }
}
