package lab1_2;

public class Paint implements IBuildingmaterials {

    private String type;
    private String brand;
    private double price;
    private int sum;
    private int volume;

    public Paint(String type, String brand, double price, int sum, int volume) {
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.sum = sum;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public String getDescription() {
        return "Type: " + type + ", brand: " + brand + ", price: " + price + ", sum: " + sum + ", volume: " + volume + "\n";
    }
}