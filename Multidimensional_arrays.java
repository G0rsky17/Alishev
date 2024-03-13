
public class Multidimensional_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3};
		
		int[][] matrix = {{1,2,3,15,17},
						  {4,5,6},
						  {7,8}};
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
}
}
