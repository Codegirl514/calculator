import java.sql.SQLOutput;
import java.util.Scanner;
public class patternm {
    public static void main(String[] args) {
        Scanner S1 =new Scanner(System.in);
        System.out.println("ENter a value");
        int x = S1.nextInt();
        for(int i =1;i<=x;i++){
            for(int j = 1;j<=x;j++)
            {
                if((i==j||i+j==x+1) && i>=(x+1)/2) {
                System.out.print("*");
            }
            else if(j==1||j==x){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
                System.out.println();
            }
        }
    }
}
