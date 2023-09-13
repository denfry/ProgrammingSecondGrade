package lab2_1;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Lab2_1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество чисел: ");
            int K = scanner.nextInt();
            FileReader fileReader = new FileReader("random_numbers.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            Stack<Double> stack = new Stack<>();


            String line;
            while ((line = bufferedReader.readLine()) != null) {
                double number = Double.parseDouble(line);
                stack.push(number);
            }


            bufferedReader.close();


            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            int k = 0;


            while (!stack.isEmpty() && (k < K)) {
                double number = stack.pop();
                if (Math.abs(number) % 2 != 0 && number % 1 == 0) {
                    System.out.println(number);
                    bufferedWriter.write(String.valueOf(number));
                    bufferedWriter.newLine();
                    k++;
                }
            }


            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}