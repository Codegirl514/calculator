import java.util.Scanner;
public class aandbconcatenate {
    public static void main(String args[]){
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter a  number");
        int a = S1.nextInt();
        System.out.print("Enter a  number");
        int b = S1.nextInt();
        int n =0 , b1 =b;
        while(b1>0){
             n++;
             b1/=10;
        }
        a=(int)(Math.pow(10,n))*a+b1;
        System.out.println(a);
    }
}
