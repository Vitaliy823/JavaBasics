package GroupHW;

public class Task9 {

	public static void main(String[] args) {
		int [] oneD= {990, 450, 12, 35, 1020};
		int largest=oneD[0];
		int larg2=oneD[0];
		for (int n:oneD) {
			if (n>largest) {
				larg2=largest;
				largest=n;
			}else if (n>larg2) {
				larg2=n;
			}
		
		}
		System.out.println("Second largest number in array is "+larg2);
	}

}
