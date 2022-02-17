package GroupHW;

public class Task4 {

	public static void main(String[] args) {
		//Create a 2D array of integers. Develop a program which will calculate
		//the sum of  even and odd numbers for that array.
        int[][] twoD = { { 1, 2, 3, 4, 5 }, { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 } };
		int sumeven = 0, sumodd = 0;
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				if (twoD[i][j] % 2 == 0) {
					sumeven = sumeven + twoD[i][j];
				} else if (twoD[i][j] % 2 != 0) {
					sumodd = sumodd + twoD[i][j];
				}
			}
		}
		System.out.println("Sum of even numbers is " + sumeven);
		System.out.println("Sum of odd numbers is " + sumodd);

	}

}
