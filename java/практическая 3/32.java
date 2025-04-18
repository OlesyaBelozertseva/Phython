import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 0, b = 1;
        
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        
        String s = Long.toString(b);
        int[] counts = new int[10];
        
        for (char c : s.toCharArray()) {
            counts[c - '0']++;
        }
        
        int max = 0, digit = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] >= max) {
                max = counts[i];
                digit = i;
            }
        }
        System.out.println("[" + max + ", " + digit + "]");
    }
}