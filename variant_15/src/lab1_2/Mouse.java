package lab1_2;



public class Mouse implements PeripheralDevice {
    private String name;
    private double price;
    private boolean wireless;
    public Mouse(String name, double price, boolean wireless) {
        this.name = name;
        this.price = price;
        this.wireless = wireless;
    }
    public boolean isWireless() {
        return wireless;
    }

    @Override
    public String getType() {
        return "Мышь";
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
