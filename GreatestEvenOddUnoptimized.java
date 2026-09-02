import java.util.Scanner;

public class GreatestEvenOddUnoptimized{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter C: ");
        int c = sc.nextInt();
        sc.close();
        
        if(a>b && a>c){
            System.out.print(a + " is greatest");
            if(a%2==0){
                System.out.print(" & Even");
            }
            else{
                System.out.print(" & Odd");
            }
        }
        else if(b>a && b>c){
            System.out.print(b + " is Greatest");
            if(b%2==0){
                System.out.print(" & Even");
            }
            else{
                System.out.print(" & Odd");
            }
        }
        else{
            System.out.print(c + " is Greatest");
            if(c%2==0){
                System.out.print(" & Even");
            }
            else{
                System.out.print(" & Odd");
            }
        }
    }
}
