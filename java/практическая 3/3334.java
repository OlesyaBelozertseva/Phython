import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tanya = 0;
        
        while (n > 0) {
            // Ход Тани
            if (n % 2 == 0) {
                tanya += n/2;
                n /= 2;
            } else {
                tanya += 1;
                n -= 1;
            }
            
            // Ход Саши
            if (n > 0) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n -= 1;
                }
            }
        }
        System.out.println(tanya);
    }
}