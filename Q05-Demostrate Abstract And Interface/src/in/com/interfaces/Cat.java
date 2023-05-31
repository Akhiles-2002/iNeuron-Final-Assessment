package in.com.interfaces;

class Cat implements Animal {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void sound() {
		System.out.println(name + " says meow meow....");
	}
}
