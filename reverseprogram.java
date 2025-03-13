import java.util.Scanner;
public class reverseprogram {
    public static void main(String args[]){
        Scanner S1 = new Scanner(System.in);
        System.out.print("ENter a number");
        int n = S1.nextInt();
        int rev =0 ;
        while(n!= 0){
            int rem = n%10;
            rev =rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}
