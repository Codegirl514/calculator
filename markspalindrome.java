import java.util.Scanner;
public class markspalindrome {
    public static void main(String args[]) {
        Scanner S1 = new Scanner(System.in);
        {
            System.out.print("Enter marks of Adi");
            int A = S1.nextInt();
            System.out.print("Enter marks of Sahil");
            int S = S1.nextInt();
            int reva = 10 * (A % 10) + (A / 10);
            int revs = 10 * (S % 10) + (S / 10);
            if (A > revs || reva > S || reva > revs) {
                System.out.print("yes");
            } else {
                System.out.print("no");
            }
        }
    }
}
