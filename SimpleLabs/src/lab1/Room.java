package lab1;

public class Room {
    private final String name;
    private final int area;

    public Room(String name, double area) {
        this.name = name;
        this.area = (int) area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Помещение: " + name + ", площадь: " + area + " м2";
    }


}

class NonResidentialRoom extends Room {
    private final String purpose;

    public NonResidentialRoom(String name, double area, String purpose) {
        super(name, area);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
        return super.toString() + ", назначение: " + purpose;
    }
}