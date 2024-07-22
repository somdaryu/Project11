package object;

public class Ex3 {
	public static void main(String[] args) {
		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "둘리");

		if (student1 == student2) {
			System.out.println("student1와 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1와 student2의 주소는 다릅니다.");
		}

		if (student1.equals(student2)) {
			System.out.println("student1와 student2의 같은 학생입니다.");
		} else {
			System.out.println("student1와 student2의 다른 학생입니다.");
		}
	}
}

class Student {
	int id; // 학번
	String name; // 학생의 이름

	// 모든 멤버변수를 초기화하는 생성자 추가!
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (this.id == student.id) {
				return true;
			}
		}

		return false;
	}

}