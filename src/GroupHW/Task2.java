package GroupHW;

public class Task2 {
    
	public static void main(String[] args) {
		//Create a 2D array of integer values. Print the sum of all numbers.
		int[][] twoD = { { 1, 2, 3, 4, 5 }, { 15, 16, 17 }, { 25, 58, 63, 45 } };
		int sum = 0;
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				sum = sum + twoD[i][j];
			}
		}
		System.out.println("Sum of numbers is " + sum);
	}
}
