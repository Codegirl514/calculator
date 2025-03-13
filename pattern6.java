import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter a value ");
        int x =S1.nextInt();
        for(int i =1;i<=x;i++){
            for(int j =1;j<=x;j++){
                if((j==1 && i>=(x+1)/2)||(i ==x && j<=(x+1)/2)) System.out.print("* ");
                else if(i==1|| j==(x+1)/2) System.out.print("* ");
                else System.out.print(" ");
                }
            System.out.println();
            }
        }
    }
