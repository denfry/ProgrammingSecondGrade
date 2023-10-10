package lab2_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PriceAnalysis {
    public static void main(String[] args) {

        ArrayList<PriceData> priceDataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("variant_23/src/lab2_2/input.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    priceDataList.add(new PriceData(name, price));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("            Результаты анализа цен");
        System.out.println("+----------------------+-------------------+");
        System.out.println("|    Артикул ткани     | Цена за метр, руб.|");
        System.out.println("+----------------------+-------------------+");

        for (PriceData data : priceDataList) {
            System.out.printf("| %-20s | %-17.2f |%n", data.getName(), data.getPrice());
        }
        System.out.println("+----------------------+-------------------+");



        double totalPrice = 0;
        int count = 0;
        for (PriceData data : priceDataList) {
            totalPrice += data.getPrice();
            count++;
        }
        double averagePrice = totalPrice / count;


        System.out.printf("Средняя стоимость метра ткани: %.2f руб.%n", averagePrice);

        System.out.printf("%nСредняя стоимость метра ткани: %.2f руб.%n", averagePrice);

        // Выводим артикулы, стоимость которых превышает среднюю, в виде таблицы
        System.out.println("Артикулы, стоимость которых превышает среднюю:");
        System.out.println("+----------------------+-------------------+");
        System.out.println("|    Артикул ткани     | Цена за метр, руб.|");
        System.out.println("+----------------------+-------------------+");
        for (PriceData data : priceDataList) {
            if (data.getPrice() > averagePrice) {
                System.out.printf("| %-20s | %-17.2f |%n", data.getName(), data.getPrice());
            }
        }
        System.out.println("+----------------------+-------------------+");

        // Записываем артикулы, стоимость которых превышает среднюю, в файл
        try (FileWriter writer = new FileWriter("variant_23/src/lab2_2/output.txt")) {
            writer.write("Артикулы, стоимость которых превышает среднюю:\n");
            writer.write("+----------------------+-------------------+\n");
            writer.write("|   Артикул ткани      | Цена за метр, руб.|\n");
            writer.write("+----------------------+-------------------+\n");
            for (PriceData data : priceDataList) {
                if (data.getPrice() > averagePrice) {
                    writer.write(String.format("| %-20s | %-17.2f |%n", data.getName(), data.getPrice()));
                }
            }
            writer.write("+----------------------+-------------------+\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

