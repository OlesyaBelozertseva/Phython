import java.util.*;

public class Main {
    static int bestSum = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное расстояние, количество городов и список расстояний:");
        int maxDist = scanner.nextInt();
        int citiesCount = scanner.nextInt();
        List<Integer> distances = new ArrayList<>();
        while (scanner.hasNextInt()) {
            distances.add(scanner.nextInt());
        }
        
        findBestCombination(distances, citiesCount, maxDist, 0, new ArrayList<>(), 0);
        System.out.println(bestSum == 0 ? "null" : bestSum);
        scanner.close();
    }
    
    static void findBestCombination(List<Integer> dist, int k, int max, int start, List<Integer> current, int sum) {
        if (current.size() == k) {
            if (sum <= max && sum > bestSum) {
                bestSum = sum;
            }
            return;
        }
        for (int i = start; i < dist.size(); i++) {
            current.add(dist.get(i));
            findBestCombination(dist, k, max, i + 1, current, sum + dist.get(i));
            current.remove(current.size() - 1);
        }
    }
}