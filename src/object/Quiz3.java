package object;

public class Quiz3 {

	public static void main(String[] args) {
		Dog dog = new Dog("뭉지", "비숑");
		
		System.out.println(dog.toString());

	}

}

class Dog{
	String name;
	String type;
	
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type +" "+ name;
	}
}