package in.com.interfaces;

public interface Animal {
	
	String name = "";
		
		void sound();
		default void sleep(){
			System.out.println("Cat is sleeping");
		}

}
