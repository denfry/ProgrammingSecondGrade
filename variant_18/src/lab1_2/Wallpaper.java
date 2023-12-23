package lab1_2;

public class Wallpaper implements IBuildingmaterials {
    private String type;
    private String brand;
    private double price;
    private int sum;
    private String kind;

    public Wallpaper(String type, String brand, double price, int sum, String kind) {
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.sum = sum;
        this.kind = kind;
    }

    public String getKind() {

        return kind;
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
        return "Type: " + type + ", brand: " + brand + ", price: " + price + ", sum: " + sum + ", kind: " + kind + "\n";
    }
}