package lab1;

public class Paint extends Buildingmaterials {
    private int volume;
    public Paint(String type, String brand, double price, int sum, int volume) {
        super(type, brand, price, sum);
        this.volume=volume;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String toString() {
        return "тип - " + getType() + "; производитель - " + getBrand() + "; цена - " + getPrice() + "; количество - "
                + getSum() + "; объем - " + getVolume() + "\n";
    }
}