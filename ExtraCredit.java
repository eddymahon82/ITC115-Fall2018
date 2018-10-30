import java.util.*; //import needed resources (random for this assignment)
public class ExtraCredit {

	public static void randomWalk() {
		int steps = 0;
		int maxSteps = 0;
		Random r = new Random();

		int walk = 0;

		while (-3 < steps && steps < 3) {
			System.out.println("position = " + steps);
			steps = r.nextBoolean() ? -1 : 1;
			steps = walk + steps;
			maxSteps = Math.max(maxSteps, steps);
		}
		System.out.println("position = " + steps);
		System.out.println("max position = " + maxSteps);
	}
}