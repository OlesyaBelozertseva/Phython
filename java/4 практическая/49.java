import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fusc(n));
    }

    public static int fusc(int n) {
        int a = 0, b = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                b += a;
            } else {
                a += b;
            }
            n /= 2;
        }
        return a;
    }
}