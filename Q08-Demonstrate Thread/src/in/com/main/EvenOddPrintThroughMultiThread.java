/*
Question 8 : Write a Java program that creates two threads. The first thread should print even
numbers between 1 and 10, and the second thread should print odd numbers
between 1 and 10.
 */

package in.com.main;

public class EvenOddPrintThroughMultiThread {

	public static void main(String[] args) {

		//Creating first thread for even number
		Thread evenThread = new Thread(new EvenNumberPrinter());
		
		//Creating first thread for odd number
		Thread oddThread = new Thread(new OddNumberPrinter());
		
		//Starting the thread
		evenThread.start();
		oddThread.start();
		
	}

}

class EvenNumberPrinter implements Runnable {

	@Override
	public void run() {

		for (int i = 2; i <= 10; i += 2) {
			System.out.println("Even :: " + i);

			try {
				Thread.sleep(500); //Sleep for 500 milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OddNumberPrinter implements Runnable {

	@Override
	public void run() {
		
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("Odd :: " + i);

			try {
				Thread.sleep(500);  //Sleep for 500 milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}