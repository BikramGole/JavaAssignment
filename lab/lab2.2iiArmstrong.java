import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter num: ");
	    int n = sc.nextInt();

        int original = n,sum=0,digits=0;
        
		while (n != 0) {
			n = n / 10;
			digits++;
		}    
		
		n = original;
		
		while(n!=0){
		    int digit = n%10;
		    sum = sum + (int)Math.pow(digit,digits);
		    n = n/10;
		}
		
		
		if(original==sum){
		    System.out.print("Armstrong");
		}
		else{
		    System.out.print("Not Armstrong");
		}
		
        
    }
}
