package object;

public class Quiz1 {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(2024, 7, 22);
		MyDate date2 = new MyDate(2024, 7, 22);
		date1.equals(date2);

		MyDate date3 = new MyDate(2024, 7, 21);
		MyDate date4 = new MyDate(2024, 7, 22);
		date3.equals(date4);

	}

}

class MyDate {
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			if (this.year == date.year && this.month == date.month && this.day == date.day) {
				System.out.println("두 날짜가 같습니다.");
				return true;
			}
		}
		System.out.println("두 날짜가 다릅니다.");
		return false;
	}
}
