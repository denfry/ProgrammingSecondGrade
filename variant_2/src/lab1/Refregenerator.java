package lab1;

public class Refregenerator extends appliances{
    private double extra;
    public Refregenerator(String n, String com, double c, double cap, int year, int month, int day, double extra) {
        super(n, com, c, cap, year, month, day);
        this.extra = extra;
    }
    public double getExtra() {
        return extra;
    }
    public void setExtra(double extra) {
        this.extra = extra;
    }
    @Override
    public Double getCost() {
        return super.getCost() + extra;
    }
    @Override
    public String toString() {
        return super.toString() + ", Наценка:" + getExtra();
    }
}
