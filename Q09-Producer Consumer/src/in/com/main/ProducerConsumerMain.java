/*
Question 9 : Write a Java program that implements a producer-consumer model using
multithreading. The program should have a producer thread that generates random
numbers and adds them to a queue, and a consumer thread that reads numbers
from the queue and calculates their sum. The program should use synchronization to
ensure that the queue is accessed by only one thread at a time.

 */

package in.com.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class ProducerConsumer {
	private Queue<Integer> queue;
	private int maxSize;

	public ProducerConsumer(int maxSize) {
		this.queue = new LinkedList<>();
		this.maxSize = maxSize;
	}

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (queue.size() == maxSize) {
					wait();
				}
				Random random = new Random();
				int number = random.nextInt(100);
				queue.add(number);
				System.out.println("Produced: " + number);
				notify();
				Thread.sleep(1000); // Sleep for a while to simulate production time
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (queue.isEmpty()) {
					wait();
				}
				int number = queue.poll();
				System.out.println("Consumed: " + number);
				int sum = calculateSum();
				System.out.println("Sum: " + sum);
				notify();
				Thread.sleep(1000); // Sleep for a while to simulate consumption time
			}
		}
	}

	private int calculateSum() {
		int sum = 0;
		for (int number : queue) {
			sum += number;
		}
		return sum;
	}
}

public class ProducerConsumerMain {

	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer(5);

		Thread producerThread = new Thread(() -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread consumerThread = new Thread(() -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		producerThread.start();
		consumerThread.start();
	}
}
