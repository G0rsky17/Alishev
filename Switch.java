import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vvedite vozrast");
		String age = scanner.nextLine();
		switch(age) {
		case "ноль":
			System.out.println("You was born");
			break;
		
	case "семь":
		System.out.println("You go to school");
		break;
		
	case "восемнадцать":
		System.out.println("You end a school");
		break;
		default:
			System.out.println("Ни одно условие не подошло");
		}
		
		}
}
