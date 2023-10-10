package lab1_1;

public class SecurityGuard extends Employee {
    private boolean isPrivate;
    public SecurityGuard(String name, double salary, int age, boolean isPrivate) {
        super(name, salary, age);
        this.isPrivate = isPrivate;
    }
    public boolean getIsPrivate() {
        return isPrivate;
    }
    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }
    public String displayInfo() {
        String description = isPrivate ? "Сотрудник фирмы" : "Частный охранник";
        return "Имя охранника: " + getName() + ", возраст: " + getAge() + ", " + description;
    }

    @Override
    public void performTask(String task) {
        System.out.println(getName() + " выполняет задание: " + task);
    }

    @Override
    public double calculateBonus() {
        return getSalary() / 3;
    }
}
