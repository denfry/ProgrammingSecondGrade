package lab1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<IRoom> rooms = new ArrayList<>();
        rooms.add(new ResidentialRoom("Спальня", 20.5, 1, true, "Центральное"));
        rooms.add(new ResidentialRoom("Гостиная", 30.0, 0, false, "Электрическое"));
        rooms.add(new ResidentialRoom("Детская", 15.0, 2, false, "Нет"));
        rooms.add(new ResidentialRoom("Кухня", 12.0, 0, true, "Центральное"));
        rooms.add(new NonResidentialRoom("Офис", 50.0, "Рабочее помещение"));
        rooms.add(new NonResidentialRoom("Кабинет", 25.0, "Рабочее помещение"));
        rooms.add(new NonResidentialRoom("Склад", 100.0, "Хранение товаров"));
        rooms.add(new NonResidentialRoom("Магазин", 75.0, "Продажа товаров"));
        rooms.add(new NonResidentialRoom("Студия", 40.0, "Творческая деятельность"));
        rooms.add(new NonResidentialRoom("Зал", 80.0, "Мероприятия"));

        IRoom smallestResidentialRoom = findSmallestResidentialRoom(rooms);
        if (smallestResidentialRoom != null) {
            System.out.println("Самое маленькое жилое помещение: " + smallestResidentialRoom.getName());
            System.out.println("Нужно ли вывести полную информацию? (да/нет)");
            String response_smallest = scanner.nextLine();
            if (response_smallest.equals("да")) {
                System.out.println(smallestResidentialRoom.getDescription());
            }

        } else {
            System.out.println("Жилых помещений не найдено.");
        }

        System.out.print("Введите назначение, которое нужно найти: ");
        String targetPurpose = scanner.nextLine();

        System.out.println("Нежилые помещения с назначением '" + targetPurpose + "':");
        List<IRoom> matchingNonResidentialRooms = findNonResidentialRoomsWithPurpose(rooms, targetPurpose);
        if (!matchingNonResidentialRooms.isEmpty()) {
            for (IRoom room : matchingNonResidentialRooms) {
                System.out.println(room.getName());
                System.out.println("Нужно ли вывести полную информацию? (да/нет)");
                String response = scanner.nextLine();
                if (response.equals("да")) {
                    System.out.println(room.getDescription());
                } else {
                    System.out.println("Программа завершена.");
                }
            }
        } else {
            System.out.println("Нежилых помещений с заданным назначением не найдено.");
        }
    }

    private static IRoom findSmallestResidentialRoom(List<IRoom> rooms) {
        IRoom smallestRoom = null;
        double smallestArea = Double.MAX_VALUE;
        for (IRoom room : rooms) {
            if (room instanceof ResidentialRoom residentialRoom) {
                if (residentialRoom.getArea() < smallestArea) {
                    smallestArea = residentialRoom.getArea();
                    smallestRoom = residentialRoom;
                }
            }
        }
        return smallestRoom;
    }

    private static List<IRoom> findNonResidentialRoomsWithPurpose(List<IRoom> rooms, String purpose) {
        List<IRoom> matchingRooms = new ArrayList<>();
        for (IRoom room : rooms) {
            if (room instanceof NonResidentialRoom nonResidentialRoom) {
                if (nonResidentialRoom.getPurpose().equalsIgnoreCase(purpose)) {
                    matchingRooms.add(nonResidentialRoom);
                }
            }
        }
        return matchingRooms;
    }
}
