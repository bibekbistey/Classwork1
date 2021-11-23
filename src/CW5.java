import java.util.Scanner;
public class CW5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float physics;
        float chemistry;
        float english;
        float mathematics;
        float computer;
        float total;
        float percentage;
        System.out.print("Enter the marks scored in physcis:");
        physics=sc.nextFloat();
        System.out.print("Enter the marks oscored in chemistry:");
        chemistry=sc.nextFloat();
        System.out.print("Enter the marks scored in english:");
        english=sc.nextFloat();
        System.out.print("Enter the marks scored in mathematics:");
        mathematics=sc.nextFloat();
        System.out.print("Enter the marks scored in computer:");
        computer=sc.nextFloat();
        total=physics+chemistry+english+mathematics+computer;
        percentage=total/5;
        if (percentage>=90) {
            System.out.println("You scored grade A");
        }
        else if (percentage>=80 && percentage<=89){
            System.out.println("You scored B grade");
        }
        else if (percentage>=70 && percentage<=79){
            System.out.println("You scored C grade");
        }
        else if (percentage>=60 && percentage<=69){
            System.out.println("You scored D grade");
        }
        else if (percentage>=40 && percentage<=59){
            System.out.println("You scored E grade");
        }
        else if (percentage<40){
            System.out.println("You scored F grade");
        }
        System.out.println(percentage+"%");

    }
}
