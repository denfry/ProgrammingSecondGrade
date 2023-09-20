import java.util.Date;

public class Sotrud2 extends ASotrud{
    private double bonus;

    public Sotrud2(String name, String post, Date indate, double salary, double bonus) {
        super(name, post, indate);
        this.salary = salary;
        this.bonus = bonus;
    }


    public double getSalary() {
        return salary+salary*bonus/100;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }



    public String getInfo() {
        return getName() + " "  + " " + getSalary() + " " + " " + getBonus();
    }
}
