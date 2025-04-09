import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, сдвиг и направление (1 - вправо, -1 - влево):");
        String text = scanner.nextLine();
        int shift = scanner.nextInt();
        int direction = scanner.nextInt();
        
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char)(base + (c - base + shift * direction + 26) % 26);
            }
            result.append(c);
        }
        System.out.println(result);
        scanner.close();
    }
}