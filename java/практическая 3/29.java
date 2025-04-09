import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int j = i + 1;
            if (j * j - i * i == n) {
                System.out.println(j + "^2 - " + i + "^2 = " + n);
                return;
            }
        }
        System.out.println("Не найдено");
        scanner.close();
    }
}