import java.util.*; //import needed resources (random for this assignment)

public class Guesses {

	public static void makeGuesses() {
		int count = 0; //Initialize variable
		Random r = new Random(); //call the Random utility
		int guess;
		do {
			guess = r.nextInt(50) + 1; //call for a random whole number up to and including 50
			count++;
			System.out.println("guess = " + guess); //displays result
		} while (guess < 48); //stays inside the loop until a results of at least 48 is reached
		System.out.println("total guesses = " + count); //displays total times through loop
	}
}