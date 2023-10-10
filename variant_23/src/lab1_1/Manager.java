package lab1_1;

public class Manager extends Employee {
    private String department;
    public Manager(String name, double salary, int age, String department) {
        super(name, salary, age);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String displayInfo() {
        return "Имя менеджера: " + getName() + ", возраст: " + getAge() + " , отдел: " + department;
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
