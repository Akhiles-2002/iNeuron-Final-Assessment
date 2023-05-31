package in.com.abstractclass;

public abstract class Animal {
	
protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void sound();
	
	public void sleep() {
		System.out.println(name+" is sleeping....");
	}

}
