import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        TreeSet<Integer> u = new TreeSet<>();
        u.add(1);
        for (int i = 0; i <= x; i++) {
            u.add(2 * i + 1);
            u.add(3 * i + 1);
        }
        System.out.println(u);
    }
}