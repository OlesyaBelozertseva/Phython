import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] memory = new int[3];
        int size = 0;
        
        System.out.println("Вводите числа (Ctrl+D чтобы закончить):");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (size < 3) {
                memory[size++] = num;
            } else {
                int minIndex = 0;
                for (int i = 1; i < 3; i++) {
                    if (memory[i] < memory[minIndex]) {
                        minIndex = i;
                    }
                }
                if (num > memory[minIndex]) {
                    memory[minIndex] = num;
                }
            }
        }
        
        System.out.println("Результат:");
        for (int i = 0; i < size; i++) {
            System.out.print(memory[i] + " ");
        }
        scanner.close();
    }
}