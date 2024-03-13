
public class ClassesAndObjects {    //public class только один на проект
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.setName("");
		person1.setAge(-12);
		person1.speak();
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		Person person2 = new Person();
		
	}

}

class Person {
	//У класса могут быть:
	//1. Данные (поля)
	//2. Действия, которые он может совершать (методы)
	private String name;
	private int age;
	
	int calculateYearsToretirement() {
		int years = 65-age;
		return years;
	}
	
	public void setName(String username) {
		if(username.isEmpty()){
			System.out.println("Ты ввел пустое имя");
		} else {
			name = username;	
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int userAge) {
		if(userAge < 0) {
			System.out.println("Возраст должен быть положительным");
		} else {
			age = userAge;
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
	void setNameAndAge(String username, int userage) {
		name = username;
		age = userage;
	}
	
	void speak() {
		for(int i = 0; i<3;i++) {
			System.out.println("My name is "+name+", I am " + age+ " years old");
		}
		
	}
	
	void sayHello() {
		System.out.println("Hello");
	}

}

