import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int c ;
        System.out.println("Welcome to calculator");
        System.out.print("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.print("Enter choice");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Addition");
                c = a + b;
                System.out.println(c);
                break;
            case 2:
                System.out.println("Substraction");
                c = a - b;
                System.out.println(c);
                break;
            case 3:
                System.out.println("Multiplication");
                c = a * b;
                System.out.println(c);
                break;
            case 4:
                System.out.println("Divide");
                c = a / b;
                System.out.println(c);
                break;
            case 5:
                System.out.println("Modulo");
                c = a % b;
                System.out.println(c);
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}