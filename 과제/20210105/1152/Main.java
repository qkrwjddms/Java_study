import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		a = a.trim();	//앞 뒤 공백 제거
		
		int spc = 0;
		
		if (a.isEmpty()) {
			System.out.print(0);
			System.exit(0);
		}
		
		for (int i=0; i<a.length(); i++) {
			char achar = a.charAt(i);
			if(achar == ' ')
				spc++;
			else if(achar == '\n')
				spc++;
		}
		
		System.out.print(spc+1);
		
		System.exit(0);
	}
}
