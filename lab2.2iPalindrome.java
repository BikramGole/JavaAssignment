import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter num: ");
	    int n = sc.nextInt();

        int original = n,reverse=0;
        
		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}    
		
		if(original==reverse){
		    System.out.print("Palindrome");
		}
		else{
		    System.out.print("Not Palindrome");
		}
		
        
    }
}
