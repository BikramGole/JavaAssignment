import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter num: ");
	    int n = sc.nextInt();
	    
	    if(n%2==0){
	        System.out.print("Even ");
	    }
	    else{
	         System.out.print("Odd ");
	    }
	    
	    if(n==0){
	         System.out.print("& Zero ");
	    }
	    else if(n>0){
	        System.out.print("& Positive ");
	    }
	    else{
	        System.out.print("& Negative ");
	    }
	
	}
}
