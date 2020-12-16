package CodeAcademy;

public class vab {
	int age;
	String name;

	// behavior of an object
	public void set_value() {
			     age
	  }

	public void get_value() {
		System.out.println("Age is " + age);
		System.out.println("Name is " + name);
	}

	// main method
	public static void main(String[] args) {
		// creates a new Person object
		vab p = new vab();

		// changes state through behavior

		p.set_value();
		p.get_value();
	}
}
