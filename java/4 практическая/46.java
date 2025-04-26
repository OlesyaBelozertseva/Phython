import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine().trim();
        System.out.println(romanToArabic(roman));
    }

    static int romanToArabic(String s) {
        int sum = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            sum = (curr < prev) ? sum - curr : sum + curr;
            prev = curr;
        }
        return sum;
    }
}