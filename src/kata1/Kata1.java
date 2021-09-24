package kata1;

import java.time.LocalDate;

public class Kata1 {
    public static void main(String[] args) {
        Person person1 = new Person("Cecilia", LocalDate.of(1999, 10, 10));
        
        System.out.println(person1.getName() + " tiene " + person1.getAge() + " años ");
    }
    
}
