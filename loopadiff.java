import java.util.Scanner;
public class loopadiff {
    public static void main(String args[]){
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter a number");
        long n =S1.nextLong();
        long ans =1;
        while(n>3){
            n /=4;
            ans*=2;
        }
        System.out.println(ans);
    }
}
