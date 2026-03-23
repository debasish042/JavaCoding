package Stream_API_Questions;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmployeeOfEachDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Bangalore", 80000, Arrays.asList("Java", "Spring"), "IT"),
                new Employee(2, "Bob", "Hyderabad", 60000, Arrays.asList("JavaScript", "React"), "IT"),
                new Employee(3, "Charlie", "Bangalore", 90000, Arrays.asList("Java", "Microservices"), "IT"),
                new Employee(4, "David", "Pune", 50000, Arrays.asList("HR", "Recruitment"), "HR"),
                new Employee(5, "Eve", "Hyderabad", 70000, Arrays.asList("Finance", "Excel"), "Finance")
        );

                   Map<String, Optional<Employee>> map= employees.stream()
                            .collect(Collectors.groupingBy(Employee::getDepartment,
                                    Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

                   map.forEach((department,employee)->{System.out.println(department+":"+employee);});

    }
}
