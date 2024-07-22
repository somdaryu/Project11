package String;

public class Quiz4 {

	public static void main(String[] args) {
		
		int result1 = getCharCount("자바 프로그래밍 입문");
		System.out.println(result1);
		
		int result2 = getCharCount("equals 메소드는 두 객체가 같은지 비교한다");
		System.out.println(result2);
		
		
	}
	static int getCharCount(String str) {
		int length = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				length++;
			}
		} //배열의 요소를 하나씩 꺼내서 공백인지 확인할 것!
		return length;
	}

}
