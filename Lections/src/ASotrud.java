import java.util.Date;

public abstract class ASotrud {
    protected double salary;
    private String name;
    private String post;
    private Date indate;
    public ASotrud(String name, String post, Date indate) {
        this.name = name;
        this.post = post;
        this.indate = indate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract double getSalary();
    public abstract String getInfo();
}
