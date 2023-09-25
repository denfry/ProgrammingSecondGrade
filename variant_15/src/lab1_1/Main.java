package lab1_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PeripheralDevice> peripherals = new ArrayList<>();
        peripherals.add(new Monitor("Монитор 1", 20000, 24));
        peripherals.add(new Mouse("Мышь 1", 3000, true));
        peripherals.add(new Monitor("Монитор 2", 15000, 19));
        peripherals.add(new Mouse("Мышь 2", 2500, false));
        peripherals.add(new Monitor("Монитор 3", 18000, 21));
        peripherals.add(new Mouse("Мышь 3", 3500, true));
        peripherals.add(new Monitor("Монитор 4", 25000, 27));
        peripherals.add(new Mouse("Мышь 4", 3000, false));
        peripherals.add(new Monitor("Монитор 5", 17000, 23));
        peripherals.add(new Mouse("Мышь 5", 4000, true));

        double totalMonitorPrice = 0;
        double totalMousePrice = 0;

        int totalMonitors = 0;

        for (PeripheralDevice device : peripherals) {
            String type = device.getType(); // Используем метод getType()
            if ("Монитор".equals(type)) {
                Monitor monitor = (Monitor) device;
                System.out.println("Тип: " + type);
                System.out.println("Наименование: " + monitor.getName());
                System.out.println("Цена: ₽" + monitor.getPrice());
                System.out.println("Размер экрана: " + monitor.getScreenSize() + " дюймов");
                totalMonitorPrice += monitor.getPrice();
                totalMonitors++;
            } else if ("Мышь".equals(type)) {
                Mouse mouse = (Mouse) device;
                System.out.println("Тип: " + type);
                System.out.println("Наименование: " + mouse.getName());
                System.out.println("Цена: ₽" + mouse.getPrice());
                System.out.println("Беспроводная: " + (mouse.isWireless() ? "Да" : "Нет"));
                totalMousePrice += mouse.getPrice();
            }
            System.out.println("===============================");
        }
        System.out.println("Общая стоимость мониторов: ₽" + totalMonitorPrice);
        System.out.println("Общая стоимость мышей: ₽" + totalMousePrice);
        System.out.println("Общее количество мониторов: " + totalMonitors);

    }
}
