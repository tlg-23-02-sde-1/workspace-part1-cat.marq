package human.being;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Cat", LocalDate.of(1982, 1, 24));

        System.out.println(p1);  // toString() is automatically called
        System.out.println();
        System.out.printf("%s is %s years old", p1.getName(), p1.getAge());
    }
}