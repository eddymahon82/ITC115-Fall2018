
public class FibonacciNumbers {

	public static void main(String[] args) {
		// initialize the variables
		int a=1;
		int b=1;
		int c=2;
		System.out.print(a + " " +b + " ");

		for (int i=3; i<=12; i++){
		c=a+b;
		b=a;
		a=c;

		System.out.print(c + " ");
		}

	}

}
