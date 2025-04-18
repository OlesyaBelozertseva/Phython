import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и начальную степень:");
        int num = scanner.nextInt();
        int power = scanner.nextInt();
        
        int temp = num;
        int sum = 0;
        int currentPower = power;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, currentPower);
            temp /= 10;
            currentPower++;
        }
        
        for (int i = 1; i <= 64; i++) {
            if (num * i == sum) {
                System.out.println("true: " + num + " * " + i + " = " + sum);
                return;
            }
        }
        System.out.println("false");
        scanner.close();
    }
}