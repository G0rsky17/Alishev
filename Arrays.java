
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;//примитивный тип [10]
		char ch = 'a';
		String s = "hello"; //ссылочный тип
		
		int[] numbers = new int[5]; //ссылочный тип numbers -> [массив]
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i*10;
			System.out.println(numbers[i]);
		}
		
		
	}

}
