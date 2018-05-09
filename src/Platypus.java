
public class Platypus {
	private String name;

	Platypus(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");

	}
}
