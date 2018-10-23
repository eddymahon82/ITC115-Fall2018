import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		
        System.out.print("Please enter the month (1-12): ");
        int month = console.nextInt();
        
        System.out.print("Please enter the day number: ");
        int day   = console.nextInt();
        
        //calls the seasons method and pass it the month and day int
        System.out.println(seasons(month,day));
    }

	public static String seasons(int month, int day) {
		if(month < 3 || (month == 3 && day <= 15) || (month == 12 && day >= 16)) {
			return "Winter";
		} else if((3 < month && month < 6) || (month == 3 && day >= 16) || (month == 6 && day <= 15)) {
			return "Spring";
		} else if((6 < month && month < 9) || (month == 6 && day >= 16) || (month == 9 && day <= 15)) {
			return "Summer";
		} else {
			return "Fall";
		}
	}
}

