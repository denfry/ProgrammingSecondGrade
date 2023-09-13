package lab1_1;

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
