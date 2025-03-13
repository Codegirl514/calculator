import java.sql.SQLOutput;
import java.util.Scanner;
public class snowmanpattern {
    public static void main(String args[]) {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = S1.nextInt();
        //equilateral triangle with space

        for (int i = 1; i <= n / 2; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n) && (j == 1 || j == n)) {
                    System.out.print("  ");
                } else if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n) && (j == 1 || j == n)) {
                    System.out.print("  ");
                } else if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
