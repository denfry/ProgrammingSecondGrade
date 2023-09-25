package lab1;

public class Mouse extends PeripheralDevice {

    private boolean wireless;
    public Mouse(String name, double price, boolean wireless) {
        super(name, price);
        this.wireless = wireless;
    }
    public boolean isWireless() {
        return wireless;
    }
}
