package lab1_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Itexnika implements Iappliances{
    private String name;
    private String company;
    protected double cost;
    private double capacity;
    private Date indate;
    public Itexnika(String name, String company, double cost, double capacity, int year, int month, int day) {
        this.name= name;
        this.company = company;
        this.capacity = capacity;
        this.cost = cost;
        indate = (new GregorianCalendar(year, month-1,day)).getTime();
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public double getCost() {
        return cost;
    }
    public double getCapacity() {
        return capacity;
    }
    public Date getIndate() {
        return indate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }
    public void setIndate(Date i) {
        indate = i;
    }
    public String toString() {
        return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " +  "Цена: " + getCost() + ", \n"
                + "" + "Вместимость: " + getCapacity() + ", " +  "Дата поступления: " + getIndate();
    }
}
