package lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.println("Реализация через обычный класс:");
        employees.add(new Manager("Менеджер 1", 10000, 30, "IT"));
        employees.add(new Manager("Менеджер 2", 12000, 35, "Marketing"));
        employees.add(new Manager("Менеджер 3", 14000, 40, "IT"));
        employees.add(new Manager("Менеджер 4", 16000, 45, "IT"));
        employees.add(new Manager("Менеджер 5", 18000, 50, "Sales"));
        employees.add(new SecurityGuard("Охранник 1", 8000, 25, true));
        employees.add(new SecurityGuard("Охранник 2", 8500, 28, false));
        employees.add(new SecurityGuard("Охранник 3", 9000, 30, false));
        employees.add(new SecurityGuard("Охранник 4", 9500, 32, false));
        employees.add(new SecurityGuard("Охранник 5", 8200, 26, true));


        System.out.print("Введите отдел: ");
        String targetDepartment = scanner.nextLine();

        displayManagersByDepartment(employees, targetDepartment);

        int securityGuardCount = countSecurityGuards(employees);
        System.out.println("Число охранников: " + securityGuardCount);
    }
    public static void displayManagersByDepartment(List<Employee> employees, String targetDepartment) {
        System.out.println("Информация о менеджерах в отделе " + targetDepartment + ":");
        for (Employee employee : employees) {
            if (employee instanceof Manager && ((Manager) employee).getDepartment().equals(targetDepartment)) {
                System.out.println(((Manager) employee).displayInfo());
            }
        }
    }
    public static int countSecurityGuards(List<Employee> employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof SecurityGuard) {
                count++;
            }
        }
        return count;
    }
}
