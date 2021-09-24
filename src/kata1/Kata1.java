package kata1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1980, 1, 1);
        Person person1 = new Person("Antonio", birthdate);
        
        System.out.println(person1.getName() + " tiene " + person1.getAge() + " años ");
    }
    
}
