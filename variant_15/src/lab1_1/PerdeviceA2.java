package lab1_1;

public class PerdeviceA2 extends PeripheralDevice{
    public PerdeviceA2(double price, String model) {
        super(price, model);
    }

    public String getInfo() {
        return "Модель: " + getModel() + "; цена: " + getPrice();
    }
}
