package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthday;

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        Calendar now = GregorianCalendar.getInstance();
        return millisecondsToYears(now.getTimeInMillis() - birthday.getTimeInMillis());
    }

    private int millisecondsToYears(long time) {
        long MillisecondsPerYear = (long) (365.25*24*60*60*1000);
        return (int) (time/MillisecondsPerYear);
    }
}
