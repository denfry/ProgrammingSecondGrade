package lab1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new ResidentialRoom("Спальня", 20.5, 1, true, "Центральное"));
        rooms.add(new ResidentialRoom("Гостиная", 30.0, 0, false, "Нет"));
        rooms.add(new NonResidentialRoom("Офис", 50.0, "Рабочее помещение"));
        rooms.add(new NonResidentialRoom("Склад", 100.0, "Хранение товаров"));


        ResidentialRoom smallestResidentialRoom = findSmallestResidentialRoom(rooms);
        if (smallestResidentialRoom != null) {
            System.out.println("Самое маленькое жилое помещение: " + smallestResidentialRoom.getName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите назначение, которое нужно найти: ");
        String targetPurpose = scanner.nextLine();

        System.out.println("Нежилые помещения с назначением '" + targetPurpose + "':");
        List<NonResidentialRoom> matchingNonResidentialRooms = findNonResidentialRoomsWithPurpose(rooms, targetPurpose);
        if (!matchingNonResidentialRooms.isEmpty()) {
            for (NonResidentialRoom room : matchingNonResidentialRooms) {
                System.out.println(room.getName());
            }
        } else {
            System.out.println("Нежилых помещений с заданным назначением не найдено.");
        }
    }


    private static ResidentialRoom findSmallestResidentialRoom(List<Room> rooms) {
        ResidentialRoom smallestRoom = null;
        double smallestArea = Double.MAX_VALUE;
        for (Room room : rooms) {
            if (room instanceof ResidentialRoom residentialRoom) {
                if (residentialRoom.getArea() < smallestArea) {
                    smallestArea = residentialRoom.getArea();
                    smallestRoom = residentialRoom;
                }
            }
        }
        return smallestRoom;
    }


    private static List<NonResidentialRoom> findNonResidentialRoomsWithPurpose(List<Room> rooms, String purpose) {
        List<NonResidentialRoom> matchingRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room instanceof NonResidentialRoom nonResidentialRoom) {
                if (nonResidentialRoom.getPurpose().equalsIgnoreCase(purpose)) {
                    matchingRooms.add(nonResidentialRoom);
                }
            }
        }
        return matchingRooms;
    }
}