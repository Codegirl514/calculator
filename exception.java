import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        int n = S1 .nextInt();
        int m = S1 .nextInt();
        try{
            System.out.println(n/m);
        } catch (Exception e) {
            System.out.println("0 sey divide hora ha ");
        }
        finally{
            System.out.println("khatam program");
        }
        //System.out.println(5);
        //System.out.println(3);
        //System.out.println(3/0);
    }
}
