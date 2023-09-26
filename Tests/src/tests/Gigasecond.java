package tests;

import java.time.*;

public class Gigasecond {

    static LocalDateTime localDateTime;
    private static final long GIGASECOND = 1000000000;

    public static void main(String[] args) {
        Gigasecond gigaSecond = new Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 23, 59, 59));
        System.out.println("" + Gigasecond.getDateTime());

        //Gigasecond gigaSecond = new Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0));
        //System.out.println("" + Gigasecond.getDateTime());
    }

    public Gigasecond(LocalDate moment) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.localDateTime = LocalDateTime.of(moment.getYear(), moment.getMonth(), moment.getDayOfMonth(), 0, 0, 0);
    }

    public Gigasecond(LocalDateTime moment) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.localDateTime = moment;
    }

    static public LocalDateTime getDateTime() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return localDateTime.plusSeconds(GIGASECOND);
    }
}
