package patterns.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        // create a Director
        Director director = new Director();

        // create a Tablet and NoteBook object
        Builder tablet = new Tablet("Exions");
        Builder noteBook = new NoteBook("Lezo");

        // making the tablet using director
        director.construct(tablet);
        Device tabletDevice = tablet.getDevice();
        tabletDevice.displayInternals();

        System.out.println();

        // making the notebook using director
        director.construct(noteBook);
        Device notebookDevice = noteBook.getDevice();
        notebookDevice.displayInternals();
    }
}
