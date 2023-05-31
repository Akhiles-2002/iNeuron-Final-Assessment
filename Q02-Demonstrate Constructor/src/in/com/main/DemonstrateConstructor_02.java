/*
Question 2 : Write a Java program to invoke parent class constructor from a child class. Create
Child class object and parent class constructor must be invoked. Demonstrate by
writing a program. Also explain key points about Constructor.
 */

/**

Key Points of Constructor
=========================
1. Constructors are special type of methods that are used to initialize object to a class.
2. Constructor have the same name as the class and do not have a return type(not even `void`).
3. Constructors are called automatically when an object is created using the `new` keyword.
4. If a constructor is not explicitly defined in a class, a default constructor(with no arguments) is provided
   by compiler.
5. Constructor can be overloaded, meaning a class can have multiple constructor with different parameters.
6. If `super()` is not explicitly called in the child class constructor, the default constructor of the parent
   class is invoked implicitly.
7. The `super()` statement must be the first line in the child class constructor.

*/

package in.com.main;

class Animal {
	public Animal() {
		System.out.println("Animal(Parent) Class Constructor Invoked....");
	}
}

class Dog extends Animal {
	public Dog() {
		super(); // Invoking the parent class constructor.
		System.out.println("Dog(Child) Class Constructor Invoked....");
	}
}

public class DemonstrateConstructor_02 {

	public static void main(String[] args) {

		Dog dog = new Dog(); // Creating an object of the child/dog class.

	}

}

