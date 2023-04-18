package patterns.builder;

public class Director {

    Builder builder;
    // Director knows how to use the Builder and steps sequence which is needed to build a Device
    void construct(Builder builder) {
        this.builder = builder;
        this.builder.startUpOperations();
        this.builder.setUpBoard();
        this.builder.setUpChipSet();
        this.builder.setUpMemory();
        this.builder.setUpStorage();
        this.builder.addCover();
    }
}
