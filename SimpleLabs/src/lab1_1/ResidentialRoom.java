package lab1_1;

public class ResidentialRoom extends Room {
    private final int numberOfBeds;


    public ResidentialRoom(String name, double area, int numberOfBeds) {
        super(name, area);
        this.numberOfBeds = numberOfBeds;

    }


    @Override
    public double calculateDecorationCost() {
        return getArea() * 50;
    }


    @Override
    public boolean isBedroom() {
        return numberOfBeds > 0;
    }


    @Override
    public String getDescription() {
        return "Room name: " + getName() + "\nArea: " + getArea() + "\nNumber of beds: " + numberOfBeds;
    }
}
