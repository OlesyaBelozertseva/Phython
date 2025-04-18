import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        
        Arrays.sort(nums, (a, b) -> {
            int sumA = 0, sumB = 0;
            for (char c : a.toCharArray()) sumA += c - '0';
            for (char c : b.toCharArray()) sumB += c - '0';
            return sumA - sumB;
        });
        
        System.out.println(String.join(" ", nums));
    }
}