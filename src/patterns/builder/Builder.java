package patterns.builder;

public interface Builder {

    void startUpOperations();
    void setUpBoard();
    void setUpChipSet();
    void setUpMemory();
    void setUpStorage();
    void addCover();
    // method used to retrieve object that is constructed
    Device getDevice();

}
