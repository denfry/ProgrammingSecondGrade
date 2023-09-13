package lab2_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileGenerator {
    public static void main(String[] args) {
        generateRandomNumbersToFile("random_numbers.txt", 1000);
    }

    public static void generateRandomNumbersToFile(String fileName, int numberOfNumbers) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            Random random = new Random();

            for (int i = 0; i < numberOfNumbers; i++) {
                double randomNumber;
                if (random.nextBoolean()) {

                    randomNumber = random.nextInt(10000); // От 0 до 999
                } else {

                    randomNumber = random.nextDouble() * 1000; // От 0.0 до 999.999
                }


                if (random.nextBoolean()) {
                    randomNumber = -randomNumber;
                }

                fileWriter.write(String.valueOf(randomNumber));
                fileWriter.write("\n");
            }

            fileWriter.close();
            System.out.println("Файл " + fileName + " сгенерирован успешно.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
