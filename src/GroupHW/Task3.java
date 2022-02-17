package GroupHW;

public class Task3 {

	public static void main(String[] args) {
		//Create a 2D array or integer type where you will store odd and even numbers. 
		//Develop a program which will identify/print the even numbers only.
		int[][] twoD = { { 10, 11, 12, 13, 14, 15 }, { 20, 21, 22, 23, 24, 25 }, { 30, 31, 32, 33, 34, 35 } };
		System.out.print("Even numbers ");
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				if (twoD[i][j] % 2 == 0) {
					System.out.print(twoD[i][j] + "  ");
				}
			}
		}
	}
}
