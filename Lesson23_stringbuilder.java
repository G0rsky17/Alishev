
public class Lesson23_stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String string1 = "Hello ";
		String string2 = " my ";
		String string3 = " friend";
		String stringAll = string1 + string2 + string3;
		System.out.println(stringAll);*/
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" my").append(" friend");
		System.out.println(sb.toString().toUpperCase());
		
		System.out.printf("this is a string %s\n", "NICE");
		System.out.printf("this is a float num %2.1f", 3.1);
	}
}

