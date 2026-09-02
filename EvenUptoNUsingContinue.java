import java.util.Scanner;

public class EvenUptoNUsingContinue{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = Sc.nextInt();

        for(int i=1;i<N;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
