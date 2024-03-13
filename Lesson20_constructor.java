
public class Lesson20_constructor {
	public static void main(String[] args) {
		Human h1 = new Human("Igor", 12);
		Human h2 = new Human("Bob", 33);
		Human h3 = new Human("Boby", 34);
		Human.description = "Cool";
		h1.getAllFields();
		h2.getAllFields();
		double i = Math.PI;
		System.out.println(i);
		h1.printNumberOfPeople();
		h2.printNumberOfPeople();
	}
}

class Human{

	private String name;
	private int age;
	public static String description;
	private static int countPeople = 0;
	
	public Human(String name, int age) {
		
		this.name = name;
		this.age = age;
		countPeople++;
	}
	
	public void setname(String name) {this.name = name;}
	
	public void setAge(int age) {this.age = age;}
	
	public void getInfo() {
		System.out.println(name+" "+age);
	}
	public static void getDescription() {
		System.out.println(description);
	}
	public void getAllFields() {
		System.out.println(name + " ," + age + " ," + description);
	}
	/*public static void printAllFields() {
		System.out.println(description);
	}*/
	
	public void printNumberOfPeople() {
		System.out.println(countPeople);
	}
	
	
}


















