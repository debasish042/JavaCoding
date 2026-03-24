package Stream_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageAgeOfPerson {
    public static void main(String[] args) {
        List<Person> person = Arrays.asList(
                new Person("Raja",25),
                new Person("Goldy",23),
                new Person("Glory",20)
        );

        OptionalDouble averageAge = person.stream()
                .mapToInt(Person::getAge)
                .average();


        System.out.println(averageAge.isPresent()?averageAge.getAsDouble():0);
    }
}
