package String;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		int maxLength = str.length() - 1;
		for(int i=maxLength; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		//StringBuilder클래스 사용
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		System.out.println(builder.toString());

	}

}
