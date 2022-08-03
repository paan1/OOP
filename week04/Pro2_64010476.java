import java.util.*;
public class Pro2_64010476 {
    public static void main(String[] args) {
        GregorianCalendar  calendar = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is"+ " " +calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is"+ " " +calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+calendar.get(GregorianCalendar.DATE));
        System.out.println("Day of week is"+" "+calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");
        calendar.add(GregorianCalendar.DATE, 1);
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is"+ " " +calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is"+ " " +calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+calendar.get(GregorianCalendar.DATE));
        System.out.println("Day of week is"+" "+calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(calendar.getTime());
    }
}

