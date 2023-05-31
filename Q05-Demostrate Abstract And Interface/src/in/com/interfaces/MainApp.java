/*
  Key Points about interfaces
  ===========================
  1. An interface is a contract that a class can implement.
  2. It can only contain abstract methods and constants(variable declared as `final`).
  3. All methods in an interface are implicitly public and abstract.
  4. Interfaces cannot have constructors.
  5. Classes implement interface using the `implements` keyword.
  6. A class can implements multiple interfaces.
*/

package in.com.interfaces;

public class MainApp {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat("Cat");
		cat.sound();
		cat.sleep();
		
	}
}