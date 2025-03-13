import java.util.Scanner;
public class sumofdigit {
    public static void main(String args[]){
        Scanner S1 = new Scanner (System.in);
        int sum = 0;
        System.out.print("Enter a number");
        int n = S1.nextInt();
        while(n>0){
            sum +=(n%10);
            n /=10;
        }
        System.out.print(sum);

}}
