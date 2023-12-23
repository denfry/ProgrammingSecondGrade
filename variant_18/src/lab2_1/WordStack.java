package lab2_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class WordStack {
    public static void main(String[] args) {
        String fileName = "variant_18/src/lab2_1/input.txt"; // Замените на имя вашего файла
        Stack<String> wordStack = new Stack<>();

        // Чтение слов из файла и добавление их в стек
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Модифицированное разделение строки на слова без знаков препинания
                String[] words = line.split("[\\s,;:.!?'()-]+");
                for (String word : words) {
                    wordStack.push(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Вывод слов на экран и в файл в обратном порядке
        try (FileWriter writer = new FileWriter("variant_18/src/lab2_1/output.txt")) {
            while (!wordStack.isEmpty()) {
                String word = wordStack.pop();
                if (countVowels(word) >= 3) {
                    System.out.println(word);
                    writer.write(word + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для подсчета количества гласных букв в слове (английские и русские), игнорируя знаки препинания
    private static int countVowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            // Добавлено условие проверки наличия буквы перед увеличением счетчика
            if (Character.isLetter(c) && isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    // Метод для определения, является ли символ гласной буквой (английская и русская)
    private static boolean isVowel(char c) {
        return "aeiouаеёиоуыэюя".indexOf(Character.toLowerCase(c)) != -1;
    }
}
