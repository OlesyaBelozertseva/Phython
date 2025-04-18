import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        
        for (String word : words) {
            if (word.length() > 0) {
                String newWord = word.substring(1) + word.charAt(0) + "ауч";
                System.out.print(newWord + " ");
            }
        }
    }
}