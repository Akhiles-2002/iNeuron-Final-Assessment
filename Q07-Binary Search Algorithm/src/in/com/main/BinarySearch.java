/*
Question 7 : Create a Java program that implements a binary search algorithm. The program
should accept user input for the target value and search for it in a sorted array. The
program should return the index of the target value if found or a message if not
found.
 */

package in.com.main;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number to Search :: ");
		int searchNumber = scanner.nextInt();

		int index = binarySearch(array, searchNumber);
		if (index != -1) {
			System.out.println("Number Found at index :: " + index);
		} else {
			System.out.println("Number is not found.");
		}

	}

	public static int binarySearch(int[] array, int searchNumber) {

		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (array[mid] == searchNumber) {
				return mid; // Target value or number found
			} else if (array[mid] < searchNumber) {
				low = mid + 1; // Target value may be in right half
			} else {
				high = mid - 1; // Target value may be in left half
			}
		}

		return -1; // Target value not found.
	}

}
