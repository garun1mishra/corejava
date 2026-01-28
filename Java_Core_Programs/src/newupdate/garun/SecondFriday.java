package newupdate.garun;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondFriday {
//    public static final LocalDate EPOCH = LocalDate.of(2022, 9, 1);
    public static void main(String a[]){
        //       How do you get the second Friday of next month?
        LocalDate date1 = LocalDate.of(2022, 9, 1);
        LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
        LocalDate secondFriday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(TemporalAdjusters.next(DayOfWeek.SUNDAY)).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Second Friday on : " + secondFriday);

    }
}
