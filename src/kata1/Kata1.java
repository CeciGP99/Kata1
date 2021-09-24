package kata1;

import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Person person1 = new Person("Antonio", new Date(80,0,1));
        
        System.out.println(person1.getName() + " tiene " + person1.getAge() + " años ");
    }
    
}
