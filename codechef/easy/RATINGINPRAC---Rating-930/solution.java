import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }

            // Your code goes here
            boolean c = true;
            for (int i = 0; i < n-1; i++) {
                if (d[i + 1] < d[i]) {
                    c = false;
                    break;
                }
            }
            System.out.println(c ? "Yes" : "No");
        }
    }
}