package lab1_2;

public class ResidentialRoom implements IRoom {
    private String name;
    private double area;
    private int numberOfBathrooms;
    private String heating;
    private boolean hasBalcony;

    public ResidentialRoom(String name, double area, int numberOfBathrooms, boolean hasBalcony, String heating) {
        this.name = name;
        this.area = area;
        this.numberOfBathrooms = numberOfBathrooms;
        this.hasBalcony = hasBalcony;
        this.heating = heating;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getDescription() {
        return "Room name: " + getName() + "\nArea: " + getArea() + "\nNumber of bathrooms: " + numberOfBathrooms + "\nHas balcony: " + hasBalcony + "\nHeating type: " + heating;
    }


    public int getNumberOfBathrooms() {
        return numberOfBathrooms;

    }

    public String getHeatingType() {
        return heating;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }
}
