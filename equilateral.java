import java.sql.SQLOutput;
import java.util.Scanner;
public class equilateral {
    public static void main(String[] args) {
        int i,j,n;
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter a number ");
        n = S1.nextInt();
        //outer loops to enter  rows
        for(i=1;i < n;i++){
            //iner to enter spaces
            for (j=n-i;j>1;j--){
                System.out.print(" ");
            }
        for(j =1;j<=i;j++){
            System.out.print("*");
        }

            System.out.println();
        }
        for(i = n-1 ;i >0 ;i--){
            //iner to enter spaces
            for (j = 1;j <= n-i ;j++){
                System.out.print(" ");
            }
        for(j = 1;j <= i*2-1 ; j++){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
