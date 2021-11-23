import java.util.Scanner;
public class CW2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter the first number:");
        a=sc.nextInt();
        System.out.print("Enter the second number:");
        b=sc.nextInt();
        System.out.print("Enter the second number:");
        c=sc.nextInt();
        if(a>b && a>c)
            System.out.print(a+" is the maximum number between them");
        else if(b>a && b>c)
            System.out.print(b+" is the maximum number between them");
        else if(c>a && c>b)
            System.out.print(c+" is the maximum number between them");
        else
            System.out.print("All the three numbers are equal");
    }
}
