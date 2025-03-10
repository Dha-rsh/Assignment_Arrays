package array;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				 Scanner sc = new Scanner(System.in);

			        System.out.print("Enter rows and columns of first matrix: ");
			        int rows1 = sc.nextInt(), cols1 = sc.nextInt();
			        
			        System.out.print("Enter rows and columns of second matrix: ");
			        int rows2 = sc.nextInt(), cols2 = sc.nextInt();
			      
			        
			        int[][] mat1 = new int[rows1][cols1];
			        int[][] mat2 = new int[rows2][cols2];
			        int[][] result = new int[rows1][cols2];
			        
			        System.out.println("Enter elements of first matrix:");
			        for (int i = 0; i < rows1; i++)
			            for (int j = 0; j < cols1; j++)
			                mat1[i][j] = sc.nextInt();
			        
			        System.out.println("Enter elements of second matrix:");
			        for (int i = 0; i < rows2; i++)
			            for (int j = 0; j < cols2; j++)
			                mat2[i][j] = sc.nextInt();
			        
			        // Matrix Multiplication
			        for (int i = 0; i < rows1; i++) {
			            for (int j = 0; j < cols2; j++) {
			                for (int k = 0; k < cols1; k++) {
			                    result[i][j] += mat1[i][k] * mat2[k][j];
			                }
			            }
			        }
			        
			        System.out.println("Resultant Matrix:");
			        for (int i = 0; i < rows1; i++) {
			            for (int j = 0; j < cols2; j++)
			                System.out.print(result[i][j] + " ");
			            System.out.println();
			        }
		        
			}

		}


