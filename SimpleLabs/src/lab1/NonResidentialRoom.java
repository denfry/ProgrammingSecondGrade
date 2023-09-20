package lab1;

class NonResidentialRoom extends Room {
    private String purpose;

    public NonResidentialRoom(String name, double area, String purpose) {
        super(name, area);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return super.toString() + ", назначение: " + purpose;
    }
}
