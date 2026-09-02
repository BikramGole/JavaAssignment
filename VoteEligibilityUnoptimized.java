import java.util.Scanner;

public class VoteEligibilityUnoptimized{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = inp.nextInt();

        if(age>=18){
            System.out.println("You are eligible to Vote");
        }
        else{
            System.out.println("You are not eligible to Vote");
        }
    }
}
