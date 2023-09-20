import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Sotrud[] sotrud = new Sotrud[10];
        sotrud[0] = new Sotrud("Иванов", "Инженер", 60000, new Date(2010, Calendar.OCTOBER, 1));
        sotrud[1] = new Sotrud("Петров", "Ст. инженер", 70000, new Date(2011, Calendar.OCTOBER, 1));
        sotrud[2] = new Manager("Сидоров", "Менеджер отдела маркетинга", 80000, new Date(2012, Calendar.OCTOBER, 1), 17000);

        for (Sotrud value : sotrud) {
            if (value instanceof Manager) {
                System.out.println(value.getInfo());
            }
        }

        /*
        x[i]>x[imax]
        sotr[i].getSalary()>sotr[imax].getSalary()

        ((Manager)sotr[i]).getBonus()
         */
    }
}
