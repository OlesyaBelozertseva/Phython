import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Чтение двух строк
        System.out.println("Введите первую строку:");
        String first = scanner.nextLine();
        
        System.out.println("Введите вторую строку:");
        String second = scanner.nextLine();
        
        // Проверка окончания и вывод результата
        boolean isEnding = first.endsWith(second);
        System.out.println(isEnding);
        
        scanner.close();
    }
}