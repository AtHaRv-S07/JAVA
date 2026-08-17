import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int first = Integer.MIN_VALUE;
            int second=Integer.MIN_VALUE;
            int sum = 0;
            for (int num :a) {
                if (num > first) {
                    second=first;
                    first=num;
                }
                else if(num> second && num!=first){
                    second=num;
                }
                
            }
            System.out.println(first+second);
        }
    }
}