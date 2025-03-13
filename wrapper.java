import java.math.BigInteger;
import java.util.Scanner;
public class wrapper {
    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
        //System.out.println(Long.MAX_VALUE);
        //System.out.println(Long.MIN_VALUE);
        //System.out.println(Character.isLetterOrDigit(62));
        Scanner S1 = new Scanner(System.in);
        int n = S1.nextInt();
        BigInteger fact =new BigInteger("1");//""concatinate the digit

        for(int i = 1;i<=n;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }

}
