package lab1_2;



public class Monitor implements PeripheralDevice {
    private String name;
    private double price;
    private int screenSize;
    public Monitor(String name, double price, int screenSize) {
        this.name = name;
        this.price = price;
        this.screenSize = screenSize;
    }
    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public String getType() {
        return "Монитор";
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
}
