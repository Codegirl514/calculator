import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i <= t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int value = a;
            for (int j = 0; j < n; j++) {
                value += (int) Math.pow(2, j) * b;
                System.out.print(value + " ");
            }
            System.out.println();

        }
    }
}