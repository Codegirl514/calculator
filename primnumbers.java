import java.util.Scanner;
public class primnumbers {
    public static void main(String args[]){
        Scanner S1 =new Scanner(System.in);
        System.out.print("Enter a number");
        int n = S1.nextInt();
        for(int i  =2;i<=n; i++){
            int count =0;
            for(int j =1;j<=i; j++){
                if(n%i==0){
                    count++;
                }
                else if (count==2) {
                    System.out.print(n);
                }
            }
        }
    }
}
