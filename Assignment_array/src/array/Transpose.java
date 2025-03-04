package array;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows of an array :");
		int rows=sc.nextInt();
		System.out.print("Enter the columns of an array :");
		int cols=sc.nextInt();
		
		int[][] arr=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
        
         
		for(int j=0;j<cols;j++) { 
          for(int i=0;i<rows;i++) {
 			
 				System.out.print(arr[i][j]+" ");
 			}
 			System.out.println();
 		}
	}

}
