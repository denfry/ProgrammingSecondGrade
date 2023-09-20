package lab1_2;

class ResidentialRoom extends Room implements InfoProvider {
    private final int numberOfBathrooms;
    private final boolean hasBalcony;
    private final String heatingType;

    public ResidentialRoom(String name, double area, int numberOfBedrooms, boolean hasBalcony, String heatingType) {
        super(name, area);
        this.numberOfBathrooms = numberOfBedrooms;
        this.hasBalcony = hasBalcony;
        this.heatingType = heatingType;
    }
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
    public boolean hasBalcony() {
        return hasBalcony;
    }
    public String getHeatingType() {
        return heatingType;
    }

    @Override
    public String getInfo() {
        return "Жилое помещение: " + getName() + ", Площадь: " + getArea() + " кв. м, Количество спален: " +
                numberOfBathrooms + ", Балкон: " + (hasBalcony ? "Есть" : "Нет") + ", Отопление: " + heatingType;
    }
}
