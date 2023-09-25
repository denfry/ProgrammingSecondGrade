package lab1_1;

public abstract class PeripheralDevice {
    private String name;
    private double price;
    public PeripheralDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public abstract String getType();
}
