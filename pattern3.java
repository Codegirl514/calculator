import java.util.Scanner;

public class pattern3 {
    public static void main(String args[]){
    Scanner S1 =new Scanner(System.in);
    System.out.print("Enter a number");
    int n = S1.nextInt();
    for(int i = 1;i<=n;i++) {
        for (int j = 1; j <= n; j++) {
            if (i == 1|| j == 1 || i+j == n+1) {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
          }
        System.out.println();
       }
    }
}
