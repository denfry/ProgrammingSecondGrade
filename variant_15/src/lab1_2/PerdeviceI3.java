package lab1_2;

public class PerdeviceI3 implements PeripheralDevice {
    protected String model;
    protected double price;


    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getInfo() {
        return "Модель: " + getModel() + "; цена: " + getPrice();
    }
}
