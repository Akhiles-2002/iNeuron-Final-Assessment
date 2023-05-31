/*
Question 5 : Demonstrate the difference between abstract class and interface by writing programs
as well as in keypoints.
 */
/*
 Key Points about abstract Classes
 =================================
 1. An Abstract class is a class that cannot be instantiated.
 2. It can have both abstract and non-abstract methods.
 3. Abstract methods are declared without a body and must be extended by the sub classes.
 4. Non-abstract methods can be directly used by the sub classes.
 5. Abstract classes can have constructors.
 6. Subclasses extends the abstract class using the `extends` keyword.
  
 */

package in.com.abstractclass;

public class MainApp {
	
	public static void main(String[] args) {
		Cat cat = new Cat("Cat");
		cat.sound();
		cat.sleep();
	}

}