import java.util.Scanner;

public class MatrixInpDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m[][] = new int[3][3];

        System.out.println("Enter numbers for a 3x3 matrix: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nYour Matrix:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(m[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}
