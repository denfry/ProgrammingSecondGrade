package lab1;

public class Room {
    private String name;
    private int area;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public String toString() {
        return "Помещение: " + name + ", площадь: " + area + " м2";
    }


}

