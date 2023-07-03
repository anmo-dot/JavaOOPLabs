package hw2;

import java.util.Arrays;

public class DemoArray {
	public static void main(String[] args) {
		int arr1[][] = {{1,1,1}, {1,1,1}};
		int arr2[][] = {{2,2,2}, {2,2,2}};
		//System.out.println(Arrays.deepToString(arr1));
		System.out.println("Matrix 1");
		/*
		 * for(int x = 0; x < arr1.length; x++) {
		 * System.out.println(Arrays.toString(arr1[x])); }
		 */
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nMatrix 2");
		/*
		 * for(int x = 0; x < arr2.length; x++) {
		 * System.out.println(Arrays.toString(arr2[x])); }
		 */
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nSum of the Matrices");
		int[][] sum = new int[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				int a = arr1[i][j];
				int b = arr2[i][j];
				sum[i][j] = a + b;
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
