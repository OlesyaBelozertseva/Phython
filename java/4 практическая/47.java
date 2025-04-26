import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = i * N + j + 1;
        System.out.println(Arrays.toString(snail(matrix)));
    }

    public static int[] snail(int[][] matrix) {
        int[] result = new int[matrix.length * matrix.length];
        int index = 0, left = 0, right = matrix.length - 1, top = 0, bottom = matrix.length - 1;
        
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) result[index++] = matrix[top][i];
            top++;
            for (int i = top; i <= bottom; i++) result[index++] = matrix[i][right];
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) result[index++] = matrix[bottom][i];
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) result[index++] = matrix[i][left];
                left++;
            }
        }
        return result;
    }
}