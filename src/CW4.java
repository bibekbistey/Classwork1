import java.util.Scanner;
public class CW4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char word;
        System.out.print("Enter a word");
        word=sc.next().charAt(0);
        if (word=='a'|| word=='e'||word=='i'||word=='o'||word=='u')
            System.out.print("It is a vowel");
        else
            System.out.print("It isn't a vowel");

    }
}
