package GroupHW;

public class Task8 {

	public static void main(String[] args) {
		int[] oneD = { 16, 15, 147, 234, 7, 26 };
		// assign first array element to two variab
		int max = oneD[0], min = oneD[0];
		// iterate and compare from array index 1
		for (int i = 1; i < oneD.length; i++) {
			if (max < oneD[i]) {
				max = oneD[i];
			} else if (min > oneD[i]) {
				min = oneD[i];
			}
		}
		System.out.println("The maximum number is " + max);
		System.out.println("The minimum number is " + min);
	}
}
