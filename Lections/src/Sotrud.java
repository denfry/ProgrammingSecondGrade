import java.util.Date;


public class Sotrud {
    String name;
    String post;
    int salary;
    Date indate;

    public Sotrud(String name, String post, int salary, Date indate) {
        this.name = name;
        this.post = post;
        this.salary = salary;
        this.indate = indate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Date getIndate() {
        return indate;
    }
    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public String getInfo(){
        return name + " " + post + " " + salary + " " + indate;
    }
}