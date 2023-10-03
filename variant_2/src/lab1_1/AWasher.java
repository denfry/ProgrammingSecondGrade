package lab1_1;

public class AWasher extends Aappliances{
    private double discount;
    public AWasher(String name, String company, double cost, double capacity, int year, int month, int day, double discount) {
        super(name, company, capacity, year, month, day);
        this.cost = cost;
        this.discount = discount;
    }
    public Double getDiscount() {return discount;}
    public void setDiscount(Double discount) {this.discount = discount;}

    @Override
    public Double getCost() {
        return cost - discount;
    }
    @Override
    public String toString() {
        if(discount != 0) {
            return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " +  "Цена: " + getCost() + ", со скидкой: " + discount + ", \n"
                    + "" + "Вместимость: " + getCapacity() + ", " +  "Дата поступления: " + getIndate();
        }else {
            return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " +  "Цена: " + getCost() + ", \n"
                    + "" + "Вместимость: " + getCapacity() + ", " +  "Дата поступления: " + getIndate();
        }
    }
}
