package patterns.builder;

import java.util.ArrayList;

public class Device {

    private final ArrayList<String> items;
    private final String deviceName;

    public Device(String name) {
        this.items = new ArrayList<>();
        this.deviceName = name;
    }

    public void add(String item) {
        items.add(item);
    }

    public void displayInternals() {
        System.out.println("Device: " + deviceName);
        for (String item : items) {
            System.out.println(item);
        }
    }
}
