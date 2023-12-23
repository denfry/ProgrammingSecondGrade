package lab1_1;

public class Wallpaper extends Buildingmaterials {
    private String kind;

    public Wallpaper(String type, String brand, double price, int sum, String kind) {
        super(type, brand, price, sum);
        this.kind = kind;
    }

    public String getKind() {

        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }



    @Override
    public String getDescription() {
        return "Type: " + getType() + ", brand: " + getBrand() + ", price: " + getPrice() + ", sum: " + getSum() + ", kind: " + kind + "\n";
    }
}