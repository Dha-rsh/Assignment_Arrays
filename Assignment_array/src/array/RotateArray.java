package array;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Arrays: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the number of rotate: ");
		int[] arr2=new int[n];
	
		int rotate=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
            arr2[(i + rotate) % n] = arr[i];
        }
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
