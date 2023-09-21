package lab1_1;

public class NonResidentialRoom extends Room {
    private String purpose;
    public NonResidentialRoom(String name, double area, String purpose) {
        super(name, area);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }


    @Override
    public double calculateDecorationCost() {
        return 0;
    }

    @Override
    public boolean isBedroom() {
        return false;
    }

    @Override
    public String getDescription(){
        return "Нежилое помещение: " + getName() + "\nПлощадь: " + getArea() + " кв. м" + "\nНазначение: " + purpose;
    }
}
