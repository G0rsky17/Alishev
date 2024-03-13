import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int value;
		do {
			System.out.println("Vvedi 5");
			value = scanner.nextInt();
		} while(value != 5);
		System.out.println("Vy vveli 5");
		scanner.close();
	}


}
