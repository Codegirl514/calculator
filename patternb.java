import java.util.Scanner;
public class patternb {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = S1.nextInt();
        for (int i = 1; i <= n; i++) {  //print rows
            for (int j = 1; j <= n; j++) { // prrint columns
                if ((i == 1 || i == n || i == (n+1)/2) && j==n ) {
                    System.out.print("  ");
                } else if (i == (n+1)/2 || i == 1 || i == n|| j == 1||j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
