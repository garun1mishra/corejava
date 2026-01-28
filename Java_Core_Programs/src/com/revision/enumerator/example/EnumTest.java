package com.revision.enumerator.example;

//An Enum class
enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumTest {
	Day day;

	public EnumTest(Day day) {
		super();
		this.day = day;
	}

	public void dayIsLike() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
		
		System.out.println("Index of each constants : ");
		
		Day d[] = day.values();
		
		 for (Day col : d) {
	            // Calling ordinal() to find index
	            // of color.
	            System.out.println(col + " at index "
	                               + col.ordinal());
	        }
		
		
	}

	public static void main(String[] args) {

		String str = "MONDAY";
		EnumTest t1 = new EnumTest(Day.valueOf(str));
		t1.dayIsLike();
		System.out.println(Day.values().length);

	}

}
