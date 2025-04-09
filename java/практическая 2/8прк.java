import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        int upper = 0, lower = 0;
        
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }
        
        if (upper > lower) {
            System.out.println(input.toUpperCase());
        } else if (lower > upper) {
            System.out.println(input.toLowerCase());
        } else {
            System.out.println(input.toLowerCase());
        }
        scanner.close();
    }
}