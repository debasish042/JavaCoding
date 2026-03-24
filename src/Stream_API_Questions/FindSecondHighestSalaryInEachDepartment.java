package Stream_API_Questions;

/*
 ✅ Problem

👉 Find second highest salary per department

🧠 Approach (Important)
Group by department
Extract salaries
Remove duplicates (optional but good practice)
Sort in descending order
Pick 2nd element
*/


import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class FindSecondHighestSalaryInEachDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Bangalore", 80000, Arrays.asList("Java", "Spring"), "IT"),
                new Employee(2, "Bob", "Hyderabad", 60000, Arrays.asList("JavaScript", "React"), "IT"),
                new Employee(3, "Charlie", "Bangalore", 90000, Arrays.asList("Java", "Microservices"), "IT"),
                new Employee(4, "David", "Pune", 50000, Arrays.asList("HR", "Recruitment"), "HR"),
                new Employee(5, "Eve", "Hyderabad", 70000, Arrays.asList("Finance", "Excel"), "Finance")
        );

        Map<String,Optional<Double>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary,
                                Collectors.collectingAndThen(
                                        Collectors.toSet(),
                                        set->set.stream()
                                                .sorted(Comparator.reverseOrder())
                                                .skip(1)
                                                .findFirst()

                                ))));

        map.forEach((department,salary)->{System.out.println(department+"->"+
                (salary.isPresent()?salary.get():"N/A"));});


    }
}
