package wrapper;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('a'); //오토박싱 new Character('a')로 변환됨
		list.add('b'); 
		list.add('c');
		list.add('d'); 
		
		
		for(int i = 0; i<list.size(); i++) {
			char ch = list.get(i); // list.get(i).charValue()로 변환 (언박싱)
			System.out.println(ch);
		}
		
		System.out.println(list.toString()); 

	}

}
