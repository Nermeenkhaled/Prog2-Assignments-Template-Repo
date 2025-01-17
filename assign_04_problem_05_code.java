//Nermeen khaled 20216111
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int minSum = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = a[i] + a[j] + j - i;
                    if (sum < minSum) {
                        minSum = sum;
                    }
                }
            }
            System.out.println(minSum);
        }
    }
}
