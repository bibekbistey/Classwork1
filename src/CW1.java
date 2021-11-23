import java.util.Scanner;
public class CW1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int first;
        int second;
        System.out.print("Enter the first number");
        first=sc.nextInt();
        System.out.print("Enter the second number");
        second=sc.nextInt();
        if(first>second)
            System.out.print(first+"is greater than"+second);
        else if(second>first)
            System.out.print(second+"is greater than"+first);
        else
            System.out.print("Both numbers are equal");


    }


}
