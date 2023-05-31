/* 
Question 6 : Write a Java program that uses stream api to perform operations on a large data set,
such as sorting or filtering the data.
*/

package in.com.main;

import java.util.ArrayList;
import java.util.List;

public class StreamOperationExample {

	public static void main(String[] args) {

		List<Integer> dataset = new ArrayList<>();

		for (int i = 0; i < 1000; i++) {
			dataset.add(i);
		}

		// Filter the dataset to get even number only
		List<Integer> evenNumbers = dataset.stream().filter(num -> num % 2 == 0).toList();

		// Sorting the dataset in descending order
		List<Integer> sortedNumbers = dataset.stream().sorted((a, b) -> b - a).toList();

		// Printing the filtered dataset
		System.out.println("Even Numbers :: ");
		for (Integer numbers : evenNumbers) {
			System.out.print(numbers + " ");
		}

		System.out.println();

		// Printing the sorted dataset
		System.out.println("Sorted Numbers :: ");
		for (Integer numbers : sortedNumbers) {
			System.out.print(numbers + " ");
		}
		System.out.println();

	}

}
