import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        for (int i = start; i <= end; i += start) {
            System.out.print((i * i) + " ");
        }
        scanner.close();
    }
}