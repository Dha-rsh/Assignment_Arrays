package array;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value of N: ");
	        int N = scanner.nextInt();
	        scanner.close();

	        int[][] matrix = new int[N][N];
	        int top = 0, bottom = N - 1, left = 0, right = N - 1;
	        int num = 1;

	        while (num <= N * N) {
	           
	            for (int i = left; i <= right; i++)
	                matrix[top][i] = num++;
	            top++;

	           
	            for (int i = top; i <= bottom; i++)
	                matrix[i][right] = num++;
	            right--;

	            
	            for (int i = right; i >= left; i--)
	                matrix[bottom][i] = num++;
	            bottom--;

	            
	            for (int i = bottom; i >= top; i--)
	                matrix[i][left] = num++;
	            left++;
	        }

	       
	        for (int[] row : matrix) {
	            for (int val : row)
	                System.out.printf("%3d ", val);
	            System.out.println();
	        }
	    }
	}


