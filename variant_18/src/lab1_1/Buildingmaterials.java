package lab1_1;

public abstract class Buildingmaterials {
    private String type;
    private String brand;
    private double price;
    private int sum;

    public Buildingmaterials(String type, String brand, double price, int sum) {
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.sum = sum;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getSum() {
        return sum;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public abstract String getDescription();


}

