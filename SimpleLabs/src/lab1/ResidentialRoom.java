package lab1;

public class ResidentialRoom extends Room {
    private int numberOfBathrooms;
    private boolean balcony;
    private String heating;

    public ResidentialRoom(String name, double area, int numberOfBathrooms, boolean balcony, String heating) {
        super(name, area);
        this.numberOfBathrooms = numberOfBathrooms;
        this.balcony = balcony;
        this.heating = heating;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public boolean hasBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public String getHeatingType() {
        return heating;
    }

    public void setHeatingType(String heating) {
        this.heating = heating;
    }


    public String toString() {
        String balconyInfo = balcony ? "Есть балкон" : "Без балкона";
        return super.toString() + ", количество ванных комнат: " + numberOfBathrooms + ", " + balconyInfo + ", тип отопления: " + heating;
    }
}
