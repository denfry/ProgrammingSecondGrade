package lab1_1;

import java.util.Scanner;

public class Amain {
    static int amount = 11;

    public static void main(String[] args) {
        System.out.println("Задание 2");
        Aappliances[] texnika = new Aappliances[amount];
        texnika[0] = new AWasher("F2V34520", "Samsung", 28000, 6, 2006, 7, 29, 3000);
        texnika[1] = new AWasher("Bubbles3000", "IdeaProduction", 30000, 9, 2011, 7, 22, 3000);
        texnika[2] = new Arefregenerator("RB-33 J1201SA", "Samsung", 39000, 50, 2008, 7, 21, 5000);
        texnika[3] = new AWasher("BV-4358JH", "Samsung", 28000, 6, 2006, 7, 29, 3000);
        texnika[4] = new AWasher("Clean&Fresh", "Panasonic", 32000, 6, 2010, 4, 8, 3000);
        texnika[5] = new Arefregenerator("RL-58 H6020DA", "Samsung", 39000, 50, 2008, 7, 21, 5000);
        texnika[6] = new Arefregenerator("Rmod32 comfort+", "Полюс", 35000, 40, 2010, 5, 24, 5000);
        texnika[7] = new Arefregenerator("RN-21 K5433YU", "TEKA", 24000, 35, 2006, 3, 22, 5000);
        texnika[8] = new AWasher("CST G2701", "Candy", 21500, 6, 2006, 7, 29, 3000);
        texnika[9] = new AWasher("MSD 615", "Indesit", 15000, 6, 2004, 2, 13, 3000);
        texnika[10] = new Arefregenerator("GA 71234", "LG", 50000, 70, 2012, 2, 20, 5000);
        Task(texnika);
    }
    private static void Task(Aappliances[] texnika) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean Flag = false;
            int number = 0;
            String peremen;
            double biggest_V = 0;
            System.out.println("Введите нужного производителя");
            peremen = scanner.nextLine();
            for(int i = 0; i<amount; i++) {
                if((texnika[i].getCompany().equalsIgnoreCase(peremen))) {
                    System.out.println(texnika[i].toString());
                    Flag = true;
                }
                if( (texnika[i].getCapacity() > biggest_V) & (texnika[i] instanceof AWasher)) {
                    biggest_V = texnika[i].getCapacity();
                    number = i;
                }
            }
            if(Flag == false) {
                System.out.println("Такой производитель не найден");
            }
            if(biggest_V == 0) {
                System.out.println("Стиральные машины отсутствуют");
            }else {
                System.out.println("Наибольший объем барабана равен = " + biggest_V + "  у следующего товара: " + texnika[number].toString());
            }
        }
    }
}
