import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало, шаг и количество:");
        int start = scanner.nextInt();
        int step = scanner.nextInt();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print((start + i * step) + " ");
        }
        scanner.close();
    }
}