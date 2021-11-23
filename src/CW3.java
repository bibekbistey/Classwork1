import java.util.Scanner;
public class CW3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int days;
        int leap;
        System.out.print("Enter the number of days in a year:");
        days=sc.nextInt();
        if (days>=366)
            System.out.print("It is a leap year");
        else
            System.out.print("It is not a leap year");
    }
}
