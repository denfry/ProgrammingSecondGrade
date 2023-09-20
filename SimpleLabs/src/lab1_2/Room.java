package lab1_2;

abstract class Room {
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
}


