package lab1_2;

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

    public String toString() {
        return "Тип товара - " + getType() + "; производитель - " + getBrand() + "; цена - " + getPrice() + "; количество - " + getSum() + "; вид - " + kind + "\n";
    }
}