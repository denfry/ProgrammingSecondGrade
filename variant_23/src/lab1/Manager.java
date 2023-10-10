package lab1;

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
}
