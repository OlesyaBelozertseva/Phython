import java.util.Scanner;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с повторяющимися словами:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
        
        for (String word : words) {
            uniqueWords.add(word);
        }
        
        System.out.println("Результат:");
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
        scanner.close();
    }
}