package lab1_2;

public class IRefregenerator extends Itexnika {
    private double extra;

    public IRefregenerator(String name, String company, double cost, double capacity, int year, int month, int day, double extra) {
        super(name, company, cost, capacity, year, month, day);
        this.extra = extra;
    }

    @Override
    public String toString() {
        if (extra != 0)
            return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " + "Цена: " + getCost() + " с наценкой " + extra + ", \n"
                    + "" + "Вместимость: " + getCapacity() + ", " + "Дата поступления: " + getIndate();
        else
            return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " + "Цена: " + getCost() + ", \n"
                    + "" + "Вместимость: " + getCapacity() + ", " + "Дата поступления: " + getIndate();
    }
}
