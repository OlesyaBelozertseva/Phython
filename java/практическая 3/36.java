import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for (int shift = 0; shift < 26; shift++) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char)(base + (c - base - shift + 26) % 26);
                }
                System.out.print(c);
            }
            System.out.println();
        }
    }
}