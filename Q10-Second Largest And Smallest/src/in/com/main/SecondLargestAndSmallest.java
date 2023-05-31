/*
Question 10 : Write a Java program that reads a set of integers from the user and stores them in a
List. The program should then find the second largest and second smallest elements
in the List.
*/

package in.com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        if (numbers.size() < 2) {
            System.out.println("At least two numbers are required.");
            return;
        }

        int secondSmallest = findSecondSmallest(numbers);
        int secondLargest = findSecondLargest(numbers);

        System.out.println("Second Smallest Number: " + secondSmallest);
        System.out.println("Second Largest Number: " + secondLargest);
    }

    private static int findSecondSmallest(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers.get(1);
    }

    private static int findSecondLargest(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers.get(numbers.size() - 2);
    }

}
