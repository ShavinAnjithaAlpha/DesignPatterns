package patterns.singleton;

public final class Captain {
    // use private constructor to avoid use 'new' operator by user
    private static Captain captain;
    private Captain() {}

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
}
