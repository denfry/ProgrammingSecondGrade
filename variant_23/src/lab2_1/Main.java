package lab2_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> notMultipleOfThreeSet = new HashSet<>();
        Set<Integer> positiveNumbersSet = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input_2_1.txt"))) {
            String line;
            boolean foundNonMultipleOfThree = false;
            boolean foundPositiveNumber = false;

            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);

                if (number % 3 != 0) {
                    notMultipleOfThreeSet.add(number);
                    foundNonMultipleOfThree = true;
                }

                if (number > 0) {
                    positiveNumbersSet.add(number);
                    foundPositiveNumber = true;
                }
            }
            if (!foundNonMultipleOfThree) {
                System.out.println("Нет чисел, которые не делятся на 3.");
            } else if (!foundPositiveNumber) {
                System.out.println("Нет положительных чисел.");
            } else {
                System.out.println("Нет чисел, которые не делятся на 3 и не являются положительными.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Множество чисел, не кратных 3:");
        System.out.println(notMultipleOfThreeSet);
        System.out.println("Количество элементов: " + notMultipleOfThreeSet.size());

        System.out.println("\nМножество положительных чисел:");
        System.out.println(positiveNumbersSet);
        System.out.println("Количество элементов: " + positiveNumbersSet.size());

        try (PrintWriter writer = new PrintWriter("output_2_1.txt")) {
            writer.println("Множество чисел, не кратных 3:");
            writer.println(notMultipleOfThreeSet);
            writer.println("Количество элементов: " + notMultipleOfThreeSet.size());

            writer.println("\nМножество положительных чисел:");
            writer.println(positiveNumbersSet);
            writer.println("Количество элементов: " + positiveNumbersSet.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

