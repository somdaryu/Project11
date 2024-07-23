package String;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		//break:반복문 종료
		//continue:반복문 스킵
		
		while(true) {
			
			System.out.print("문장을 입력하세요:");
			String str = scanner.nextLine();
			
			if(str.equals("end") || str.equals("END")) {
				break;
			}
	
			if(str.equalsIgnoreCase("end") ) {
				break;
			}
			
			if(str.contains("END") || str.contains("end")) {
				break;
			}
		
		}
	}
}
