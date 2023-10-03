package lab1_2;

public class IWasher extends Itexnika{
    private double discount;
    public IWasher(String name, String company, double cost, double capacity, int year, int month, int day, double discount){
        super(name,company, cost, capacity ,year,month,day);
        this.discount=discount;
    }
    @Override
    public String toString(){
        if (discount != 0)
            return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " +  "Цена: " + getCost() + " со скидкой " + discount +", \n"
                    + "" + "Вместимость: " + getCapacity() + ", " +  "Дата поступления: " + getIndate();
        else
            return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " +  "Цена: " + getCost() + ", \n"
                    + "" + "Вместимость: " + getCapacity() + ", " +  "Дата поступления: " + getIndate();
    }
    @Override
    public double getCost() {
        return super.getCost() - discount;
    }
}
