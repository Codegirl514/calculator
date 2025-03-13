import java.sql.SQLOutput;
import java.util.Scanner;
public class decimaltobinary {
    public static void main(String args[]){
        Scanner S1 =  new Scanner (System.in);
        System.out.print("Enter a decimal");
        int  n = S1.nextInt();
        int  binary=0;
        int j =0;
        while(n>0){
            int rem =n%2;
            binary += (rem*(int)Math.pow(10,j));
            j++;
            n/=2;
        }
        System.out.println(binary);
    }
        }
