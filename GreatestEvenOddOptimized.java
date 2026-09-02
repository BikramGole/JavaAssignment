import java.util.Scanner;

public class GreatestEvenOddOptimized{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        int g;
        if(a>b && a>c){
            g=a;
        }
        else if(b>c && b>c){
            g=b;
        }
        else{
            g=c;
        }
        
        if(g%2==0){
            System.out.print(g + " is Greatest & Even");
        }
        else{
            System.out.print(g + " is Greatest & Odd");
        }
    }
}
