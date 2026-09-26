import java.util.Scanner;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int num[][] = new int[3][3];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter element of array: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                num[i][j] = sc.nextInt();
            }
        }
       
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i == j) {
                    sum = sum + num[i][j];
                }
            }
        }
       
        System.out.println("Sum of Principle diagonal: " + sum);
       
        System.out.println("The Matrix is: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
       
        sc.close();
    }
}
