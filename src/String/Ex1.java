package String;

public class Ex1 {

	public static void main(String[] args) {
		String str1 = "test";
		String str2 = "test";
		
		String str3 = new String("test");
		
		System.out.println(str1 == str2); //str1과 str2가 같은 객체를 공유해서 주소값이 같음
		System.out.println(str1 == str3); //새로 문자열이 생성됐으므로 주소값이 다름
	}

}
