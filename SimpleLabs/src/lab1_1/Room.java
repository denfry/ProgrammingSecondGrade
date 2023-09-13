package lab1_1;

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


interface InfoProvider {
    String getInfo();
}


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

    @Override
    public String getInfo() {
        return "Жилое помещение: " + getName() + ", Площадь: " + getArea() + " кв. м, Количество спален: " +
                numberOfBathrooms + ", Балкон: " + (hasBalcony ? "Есть" : "Нет") + ", Отопление: " + heatingType;
    }
}


class NonResidentialRoom extends Room implements InfoProvider {
    private final String purpose;

    public NonResidentialRoom(String name, double area, String purpose) {
        super(name, area);
        this.purpose = purpose;
    }

    @Override
    public String getInfo() {
        return "Нежилое помещение: " + getName() + ", Площадь: " + getArea() + " кв. м, Назначение: " + purpose;
    }

    public String getPurpose() {
        return purpose;
    }
}


