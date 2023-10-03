package lab1_1;

public class Arefregenerator extends Aappliances {private double extra;
    public Arefregenerator(String name, String company, double cost, double capacity, int year, int month, int day, double extra) {
        super(name, company, capacity, year, month, day);
        this.cost = cost;
        this.extra = extra;
    }
    @Override
    public Double getCost() {
        return cost + extra;
    }
    @Override
    public String toString() {
        if(extra != 0) {
            return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " +  "Цена: " + getCost() + ", c наценкой: " + extra + ", \n"
                    + "" + "Вместимость: " + getCapacity() + ", " +  "Дата поступления: " + getIndate();
        }else {
            return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " +  "Цена: " + getCost() + ", \n"
                    + "" + "Вместимость: " + getCapacity() + ", " +  "Дата поступления: " + getIndate();
        }
    }
}
