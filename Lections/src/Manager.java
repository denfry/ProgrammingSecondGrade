import java.util.Date;

public class Manager extends Sotrud{ // метод getSalary будет возвращать сумму базовой зарплаты и премии
    private final double bonus;
    public Manager(String name, String post, int salary, Date indate, double bonus) {
        super(name, post, salary, indate);
        this.bonus = bonus;
    }
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
    public double getBonus() {
        return bonus;
    }
}