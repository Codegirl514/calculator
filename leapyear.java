import java.util.Scanner;
public class leapyear {
    public static void main(String args[]){
        Scanner S1= new Scanner(System.in);
        System.out.print("Enter a year");
        int n = S1.nextInt();
        if(n % 400 == 0){
            System.out.print("its a leap year");
            }
        else if(n% 100 == 0&& n%4 == 0){
            System.out.print("leap year");
        }
        else{
            System.out.print("NOt a leap year");
        }

    }
}
