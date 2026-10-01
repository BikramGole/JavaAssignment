import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter two num: ");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    System.out.println("1. Addtion ");
	    System.out.println("2. Subtraction ");
	    System.out.println("3. Multiplication ");
	    System.out.println("4. Division");
	    
	    System.out.print("Enter choice: ");
	    int choice = sc.nextInt();
	    
	    switch(choice){
	         
	         case 1:
	             System.out.println("Addition is " + (a+b));
	         break;
	         
	        case 2:
	             System.out.println("Subtraction is " + (a-b));
	         break;
	         
	         case 3:
	             System.out.println("Multiplication is " + (a*b));
	         break;
	         
	         case 4:
	         if(b!=0){
	             System.out.println("Division is " +((double) a/b));
	         }
	         else{
	             System.out.println("Cannot divide by zero");
	         }
	        break;
	    	
	    	default:
	    	System.out.println("Invalid choice");
	        
	    }
    }
}
