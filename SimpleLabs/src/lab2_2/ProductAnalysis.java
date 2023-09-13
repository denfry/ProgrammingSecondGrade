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
        System.out.println("    Анализ продукции");

        System.out.println("Продукция\tПроцент брака, %");
        for (Product product : products) {
            System.out.println(product.getName() + "\t\t" + product.getDefectPercentage());
        }


        Collections.sort(products, Comparator.comparing(Product::getDefectPercentage).reversed());


        System.out.println("\nНаибольший процент брака:");
        for (int i = 0; i < Math.min(2, products.size()); i++) {
            Product product = products.get(i);
            System.out.println(product.getName() + ": " + product.getDefectPercentage() + "%");
        }


        try (PrintWriter writer = new PrintWriter("output_for_lab2_2.txt")) {
            writer.println("Наибольший процент брака:");
            for (int i = 0; i < Math.min(2, products.size()); i++) {
                Product product = products.get(i);
                writer.println(product.getName() + ": " + product.getDefectPercentage() + "%");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
