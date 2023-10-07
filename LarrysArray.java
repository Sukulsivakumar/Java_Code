package basics;

import java.util.*;

public class LarrysArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            boolean canBeSorted = true;
            for (int j = 0; j < n; j++) {
                if (a[j] != j + 1) {
                    int count = 0;
                    for (int k = j + 1; k < n; k++) {
                        if (a[k] < a[j]) {
                            count++;
                        }
                    }
                    if (count % 2 != 0) {
                        canBeSorted = false;
                        break;
                    }
                }
            }
            System.out.println(canBeSorted ? "YES" : "NO");
        }
    }
}
