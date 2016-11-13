package _date_time.date_and_time_api_java_8;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by USER on 12.11.2016, 9:57.
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localDate + " " + localTime);
        System.out.println();

        //
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println();

        //
        int year    = 2016;
        int yearDay = 136;
        LocalDate yearDayToPrint = LocalDate.ofYearDay(year, yearDay);
        System.out.println(yearDayToPrint);
        System.out.println();

        //
        int newYear = 2017;
        int newMonth = 12;
        int newDay = 22;
        LocalDate newDate = LocalDate.of(newYear, newMonth, newDay);
        System.out.println(newDate);
        System.out.println();

        //
        System.out.println(Year.now());
        System.out.println(YearMonth.now());
        System.out.println(MonthDay.now());
        System.out.println();

        //
        LocalDate year2018 = Year.of(2018).atDay(44);
        System.out.println(year2018);
        System.out.println(year2018.plusDays(5));
        System.out.println();

        //
        LocalDateTime localDateTimeNew = LocalDateTime  .now()
                                                        .minusHours(1)
                                                        .minusMinutes(10);
        System.out.println(localDateTimeNew);
        System.out.println();

        //
        LocalDateTime localDateTime1With = LocalDateTime.now().withHour(20);
        System.out.println(localDateTime1With);
        System.out.println();

        //
        System.out.println(newDate.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(newDate.with(TemporalAdjusters.lastDayOfYear()));
        System.out.println(newDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));
        System.out.println(newDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));
        System.out.println(newDate.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)));
        System.out.println(newDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)));
        System.out.println();

        //
        LocalDateTime newDateFrom = LocalDateTime.of(newDate, LocalTime.of(10, 11, 12));
        LocalDate d1 = newDateFrom.toLocalDate();
        LocalTime t1 = newDateFrom.toLocalTime();
        System.out.println(newDateFrom);
        System.out.println(d1);
        System.out.println(t1);
        System.out.println();

        //
        Instant instant = Instant.now();
        System.out.println(instant);

        //
        Period period = Period.between(newDate, LocalDate.now());
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        System.out.println(period.getUnits());
        System.out.println(period.getChronology());
        System.out.println();

        //
        Duration duration = Duration.between(LocalTime.now(), LocalTime.now().minusHours(1));
        System.out.println(duration);
        System.out.println(duration.getUnits());
        System.out.println(duration.getNano());
        System.out.println(duration.getSeconds());
        System.out.println();

    }
}
