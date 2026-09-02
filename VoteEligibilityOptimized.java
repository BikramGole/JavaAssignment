import java.util.Scanner;

public class VoteEligibilityOptimized{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = Sc.nextInt();
        System.out.println(age>=18 ? "You can vote" : "You cannot vote");
    }
}
