package lab1_1;

public class Employee extends AbstractEmployee{
    private String name;
    private double salary;
    private int age;
    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void performTask(String task) {
        System.out.println(getName() + " выполняет задание: " + task);
    }

    @Override
    public double calculateBonus() {
        return getSalary() / 2;
    }
}
