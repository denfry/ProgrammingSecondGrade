package lab1;

import java.util.Date;
import java.util.GregorianCalendar;

public class appliances {
    private String name;
    private String company;
    private double cost;
    private double capacity;
    private Date indate;
    public appliances(String n, String com, double c, double cap, int year, int month, int day) {
        name= n;
        company = com;
        cost = c;
        capacity = cap;
        indate = (new GregorianCalendar(year, month-1,day)).getTime();
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public Double getCost() {
        return cost;
    }
    public Double getCapacity() {
        return capacity;
    }
    public Date getIndate() {
        return indate;
    }


    public void setName(String n) {
        name = n;
    }
    public void setCompany(String com) {
        company = com;
    }
    public void setCost(Double c) {
        cost = c;
    }
    public void setCapacity(Double cap) {
        capacity = cap;
    }
    public void setIndate(Date i) {
        indate = i;
    }

    public String toString() {
        return "Название: " + getName() + ", " + "Производитель: " + getCompany() + ", " +  "Цена: " + getCost() + ", \n"
                + "" + "Вместимость: " + getCapacity() + ", " +  "Дата поступления: " + getIndate();
    }
}

