
public class PowersOfN {

	public static void main(String[] args) {
		
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);

	}
	
	public static void printPowersOfN (int number, int count) {
		for (int i = 0; i <= count; i++) {
			System.out.print(Math.pow(number, i) + " ");
			//System.out.println(number + " to the power of " + i + " is " + Math.pow(number, i));
		}
		System.out.println();
	}

}
