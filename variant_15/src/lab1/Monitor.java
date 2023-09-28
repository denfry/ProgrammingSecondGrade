package lab1;

public class Monitor extends PeripheralDevice {
    private int screenSize;
    public Monitor(String name, double price, int screenSize) {
        super(name, price);
        this.screenSize = screenSize;
    }
    public int getScreenSize() {
        return screenSize;
    }
}
