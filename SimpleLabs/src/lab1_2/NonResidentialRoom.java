package lab1_2;

public class NonResidentialRoom implements IRoom {
    private String name;
    private double area;
    private String purpose;

    public NonResidentialRoom(String name, double area, String purpose) {
        this.name = name;
        this.area = area;
        this.purpose = purpose;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String getDescription() {
        return "Нежилое помещение: " + getName() + "\nПлощадь: " + getArea() +
                " кв. м" + "\nНазначение: " + purpose;
    }
}
