package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period age = Period.between(birthday, now);
        return age.getYears();
    }
}
