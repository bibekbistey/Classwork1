import java.util.Scanner;
public class DetermineGroup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age;
        boolean male;
        System.out.print("Enter the age:");
        age=sc.nextInt();
        System.out.print("If you are male enter True else enter false:");
        male=sc.nextBoolean();
        if (age>20)
            if (male == true)
                System.out.print("You are a Man");
            else
                System.out.print("You are a Women");
        else
            if (male==true)
                System.out.print("You are a boyy");
            else
                System.out.print("You are a girl");
    }


}
