import java.util.Scanner;
public class findnumberofdaysinamonth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month (1-12):");
        int month = sc.nextInt();
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        switch (month) {
            //checking if number of months entered has 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("days = 31");
                break;
            //months having 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("days= 30");
                break;
            //feburary month having either 28 or 29 days
            //depending on if the year is leap year and not a  centuary year
            case 2:
                if (((year%400== 0)||(year%100 != 0 && year%4 == 0)))
                    System.out.print("days = 29");
                else
                    System.out.print("days = 28");
                break;
            default:
                System.out.println("Invalid month");
                return;

        }
        sc.close();
    }}
