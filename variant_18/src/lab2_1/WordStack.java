package lab2_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class WordStack {
    public static void main(String[] args) {
        String fileName = "variant_18/src/lab2_1/input.txt";
        Stack<String> wordStack = new Stack<>();
        boolean foundWords = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[\\s,;:.!?'()-]+");
                for (String word : words) {
                    wordStack.push(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileWriter writer = new FileWriter("variant_18/src/lab2_1/output.txt")) {
            while (!wordStack.isEmpty()) {
                String word = wordStack.pop();
                if (countVowels(word) >= 3) {
                    System.out.println(word);
                    writer.write(word + "\n");
                    foundWords = true;
                }
            }
            if (!foundWords) {
                System.out.println("Нет подходящих слов.");
                writer.write("Нет подходящих слов.\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static int countVowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && isVowel(c)) {
                count++;
            }
        }
        return count;
    }


    private static boolean isVowel(char c) {
        return "aeiouаеёиоуыэюя".indexOf(Character.toLowerCase(c)) != -1;
    }
}
