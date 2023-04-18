package patterns.builder;

public class NoteBook implements Builder {

    private final Device device;

    public NoteBook(String modelName) {
        device = new Device(modelName);
    }

    @Override
    public void startUpOperations() {
        device.add("items are fetched");
    }

    @Override
    public void setUpBoard() {
        device.add("Added motherboard Fex789");
    }

    @Override
    public void setUpChipSet() {
        device.add("Added 16-core processor Ex784");
    }

    @Override
    public void setUpMemory() {
        device.add("Added 16 GB memory card RT125");
    }

    @Override
    public void setUpStorage() {
        device.add("Added 1 TB SSD RTY74");
    }

    @Override
    public void addCover() {
        device.add("Added silver metallic cover");
    }

    @Override
    public Device getDevice() {
        return device;
    }
}
