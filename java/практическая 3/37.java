import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] code = {rand.nextInt(10), rand.nextInt(10), 
                     rand.nextInt(10), rand.nextInt(10)};
        
        for (int tryNum = 1; tryNum <= 20; tryNum++) {
            System.out.println("Попытка " + tryNum + ":");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) guess[i] = sc.nextInt();
            
            int correct = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == code[i]) correct++;
            }
            
            if (correct == 4) {
                System.out.println("Вы победили!");
                return;
            }
            System.out.println("Совпало: " + correct);
        }
        System.out.println("Вы проиграли. Код: " + 
            code[0] + code[1] + code[2] + code[3]);
    }
}