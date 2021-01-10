import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String clock = sc.nextLine();
		
		int idx = clock.indexOf(' ');
		
		int hour = Integer.parseInt(clock.substring(0,idx));
		int minute = Integer.parseInt(clock.substring(idx+1));
		
		if (minute < 45) {
			minute = (minute + 60) - 45;
			if (hour == 0) {
				hour = 23;
			}
			else
				hour--;
		}
		else 
			minute = minute - 45;
		
		System.out.print(hour + " " + minute);
		System.exit(0);
	}
}
