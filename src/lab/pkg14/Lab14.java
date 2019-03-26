package lab.pkg14;

import java.util.Scanner;

public class Lab14 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter matrix size (odd number):");
        int n = in.nextInt();
        System.out.println("Enter the minimum value of the variables:");
        int min = in.nextInt();
        System.out.println("Enter the maximum value of the variables:");
        int max = in.nextInt();
        
        SquareMatrix squareMatrix = new SquareMatrix(n, min, max);
        squareMatrix.render();
        int max1 = squareMatrix.getMaxItem(Diagonal.DIAG1);
        int max2 = squareMatrix.getMaxItem(Diagonal.DIAG2);
        max = (max1 > max2) ? max1 : max2;
        squareMatrix.setItem(max);
        squareMatrix.render();
    }
    
}
