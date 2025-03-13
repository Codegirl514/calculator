import java.util.Scanner;
public class fibonacciseries {
    public static void main(String arg[])
    {
        Scanner S1 =new Scanner(System.in);
        System.out.print("enter a number");
        int n =S1.nextInt();
        int a =0,b=1,i=2;
        while (i<=n){
            int c= a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.println(b);
    }}
