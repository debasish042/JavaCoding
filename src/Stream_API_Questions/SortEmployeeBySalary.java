package Stream_API_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeBySalary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Bangalore", 80000, Arrays.asList("Java", "Spring"), "IT"),
                new Employee(2, "Bob", "Hyderabad", 60000, Arrays.asList("JavaScript", "React"), "IT"),
                new Employee(3, "Charlie", "Bangalore", 90000, Arrays.asList("Java", "Microservices"), "IT"),
                new Employee(4, "David", "Pune", 50000, Arrays.asList("HR", "Recruitment"), "HR"),
                new Employee(5, "Eve", "Hyderabad", 70000, Arrays.asList("Finance", "Excel"), "Finance")
        );

        List<Employee> list1 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        list1.forEach(System.out::println);
    }
}
