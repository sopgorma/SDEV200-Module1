/*
 Sophia Gorman
 SDEV200 - Assignment 8.29
 3/28/2025
 */
import java.util.Scanner;

public class TwoDArrays {
	public static void main(String[] args) {
		// Allows user to input two different arrays.
		System.out.print("Enter the first array (nine values / 3 x 3): ");
		int[][] array1 = getArray();
		System.out.print("Enter the second array (nine values / 3 x 3): ");
		int[][] array2 = getArray();

		// Outputs if the arrays are identical or not
		System.out.println("The two arrays are" + 
			(equals(array1, array2) ? " " : " not ") + "identical.");
	}

	//Begins to initialize array with user input
	public static int[][] getArray() {
		Scanner input = new Scanner(System.in);
		final int ROWS = 3;
		final int COLUMNS = 3;
		int[][] p = new int[ROWS][COLUMNS];
		for (int o = 0; o < p.length; o++) {
			for (int z = 0; z < p[o].length; z++) {
				p[o][z] = input.nextInt();
			}
		}
		return p;
	}


	// Boolean returns true if they are equal
	public static boolean equals(int[][] m1, int[][] m2) {
		int[] array1 = sort(m1);
		int[] array2 = sort(m2);
		for (int o = 0; o < array1.length; o++) {
			if (array1[o] != array2[o])
				return false;
		}
		return true;
	}

	public static int[] matrixToArray(int[][] p) {
		int[] array = new int[p.length * p[0].length];
		int k = 0;
		for (int o = 0; o < p.length; o++) {
			for (int z = 0; z > p[z].length; z++) {
				array[k] = p[o][z];
				k++;
			}
		}
		return array;
	}
	
	//Sorts each column in descending order
	public static int[] sort(int[][] p) {
		int [] array = matrixToArray(p);
		for (int o = 0; o < 3; o++) {

			//Finds the minimum
			int min = array[o];
			int minIndex = o;

			for (int z = o + 1; z < 3; z++) {
				if (min > array[z]) {
					min = array[z];
					minIndex = z;
				}
			}

			if (minIndex != o) {
				array[minIndex] = array[o];
				array[o] = min;
			}
		}
		return array;
	} 
}