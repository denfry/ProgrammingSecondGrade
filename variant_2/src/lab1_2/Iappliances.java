package lab1_2;

import java.util.Date;

public interface Iappliances {
    String getName();
    String getCompany();
    double getCost();
    double getCapacity();
    Date getIndate();


    void setName(String n);
    void setCompany(String com);
    void setCost(Double c);
    void setCapacity(Double cap);
    void setIndate(Date i);

    String toString();
}
