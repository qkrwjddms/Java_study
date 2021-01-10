import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			num = sc.nextInt();
			
			if (num < 0 || num > 99) {
				System.out.print("잘못된 숫자 입니다. 다시 입력해주세요.");
				continue;
			}
			else
				break;
		}
		
		int check = 0;
		int fnum = num;
		
		while(true) {
			int num1 = num/10;
			int num2 = num%10;
			num = (num2 * 10) + ((num1 + num2) % 10);
			check++;
			
			if (num == fnum) {
				System.out.print(check);
				break;
			}
		}
		System.exit(0);
	}
}
