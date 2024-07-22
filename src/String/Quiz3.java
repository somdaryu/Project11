package String;

public class Quiz3 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍 입문";
		
		int length = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				length++;
			}
		} //배열의 요소를 하나씩 꺼내서 공백인지 확인할 것!
		System.out.println(length);
	}

}
