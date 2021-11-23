import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Enter the two digit number:");
        number=sc.nextInt();
        int rem=number%10;
        int quot=number/10;
        int result=rem*10+quot;
        if (result==number)
            System.out.print(number+"is a palindrome number");
        else
            System.out.print(number+"is not a palindrome number");



    }
}
