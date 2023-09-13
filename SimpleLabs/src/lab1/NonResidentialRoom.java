package lab1;

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
