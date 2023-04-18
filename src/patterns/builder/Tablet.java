package patterns.builder;

public class Tablet implements Builder {

    private final Device device;

    public Tablet(String modelName) {
        device = new Device(modelName);
    }

    @Override
    public void startUpOperations() {
        // start to build the device called tablet
        device.add("items are fetched");
    }

    @Override
    public void setUpBoard() {
        device.add("Added the motherboard Xn552");
    }

    @Override
    public void setUpChipSet() {
        device.add("Added the 8-core ChipSet Ex745");
    }

    @Override
    public void setUpMemory() {
        device.add("Added the 8 GB memory card Mu74589");
    }

    @Override
    public void setUpStorage() {
        device.add("Added the 256 GB SD Card Kn111");
    }

    @Override
    public void addCover() {
        device.add("Added black metal cover");
    }

    @Override
    public Device getDevice() {
        return device;
    }
}
