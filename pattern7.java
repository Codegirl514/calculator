import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n =S1.nextInt();
        for(int i =2;i<=n;i++){
            for(int j=(n+1)/2;j<=n;j++){
                if((i ==j||i+j==n+1)&&j>=((n+1)/2)) System.out.print("* ");
                else if(j==(n+1)/2)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
