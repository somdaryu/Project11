package wrapper;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String iNum1 = scanner.nextLine();
		String iNum2 = scanner.nextLine();
		
		int sum = Integer.parseInt(iNum1) + Integer.parseInt(iNum2);
		
		System.out.println(sum);
		

	}

}
