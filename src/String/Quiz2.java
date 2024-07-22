package String;

public class Quiz2 {

	public static void main(String[] args) {
		String str = "881120-2068234";
		char num = str.charAt(7);
		if(num == '1' || num == '3') {
			System.out.println("성별은 남자입니다.");
		}else if(num == '2' || num == '4') {
			System.out.println("성별은 여자입니다.");
		}else {
			System.out.println("잘못된 값입니다.");
		}
	}

}
