package lab1_1;

public abstract class Room {
    private String name;
    private double area;

    public Room(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }


    public abstract double calculateDecorationCost();

    public abstract boolean isBedroom();

    public abstract String getDescription();
}
