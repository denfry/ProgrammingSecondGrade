package lab1;

public class Washer extends appliances {
    private double discount;
    public Washer(String n, String com, double c, double cap, int year, int month, int day, double discount) {
        super(n, com, c, cap, year, month, day);
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    @Override
    public Double getCost() {
        return super.getCost() - discount;
    }
    @Override
    public String toString() {
        return super.toString() + ", Скидка:" + getDiscount();
    }
}
