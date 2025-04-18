import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt() - 1;
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) list.add(i);
        
        ArrayList<Integer> res = new ArrayList<>();
        int pos = start;
        
        while (!list.isEmpty()) {
            pos = (pos + 2) % list.size();
            res.add(list.remove(pos));
        }
        
        System.out.println(res);
    }
}