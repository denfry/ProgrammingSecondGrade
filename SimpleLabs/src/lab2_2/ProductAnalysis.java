package lab2_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductAnalysis {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input_for_lab2_2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double defectPercentage = Double.parseDouble(parts[1].trim());
                    products.add(new Product(name, defectPercentage));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("            Анализ продукции");
        System.out.println("+-----------------+--------------------+");
        System.out.println("|    Продукция    |  Процент брака, %  |");
        System.out.println("+-----------------+--------------------+");
        for (Product product : products) {
            String productName = product.name();
            String defectPercentage = product.defectPercentage() + "%";

            productName = String.format("%-15s", productName);
            defectPercentage = String.format("%-18s", defectPercentage);

            System.out.println("| " + productName + " | " + defectPercentage + " |");
        }
        System.out.println("+-----------------+--------------------+");


        products.sort(Comparator.comparing(Product::defectPercentage).reversed());


        System.out.println("\n       Наибольший процент брака");
        System.out.println("+-------------------+-------------------+");
        System.out.println("|      Продукт      |   Процент брака   |");
        System.out.println("+-------------------+-------------------+");
        for (int i = 0; i < Math.min(2, products.size()); i++) {
            Product product = products.get(i);
            String productName = product.name();
            String defectPercentage = product.defectPercentage() + "%";

            productName = String.format("%-17s", productName);
            defectPercentage = String.format("%-17s", defectPercentage);

            System.out.println("| " + productName + " | " + defectPercentage + " |");
        }
        System.out.println("+-------------------+-------------------+");


        try (PrintWriter writer = new PrintWriter("output_for_lab2_2.txt")) {
            writer.println("Наибольший процент брака:");
            for (int i = 0; i < Math.min(2, products.size()); i++) {
                Product product = products.get(i);
                writer.println(product.name() + ": " + product.defectPercentage() + "%");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
