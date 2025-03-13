import java.util.Scanner;
public class palindromenumber {
    public static void main(String args[]){
        Scanner S1 =new Scanner(System.in);
        System.out.println("enter an number");
        int n = S1.nextInt();
        int rev=0,m =n ;
        while(n>0){
            rev =10*rev+(n%10);
            n/=10;
        }
        System.out.println(rev==m);
    }
}
