package Stream_API_Questions;

import java.util.*;
import java.util.stream.Collectors;

public class GroupEmployeeByDepartmentAndCalculateAverageSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Bangalore", 80000, Arrays.asList("Java", "Spring"), "IT"),
                new Employee(2, "Bob", "Hyderabad", 60000, Arrays.asList("JavaScript", "React"), "IT"),
                new Employee(3, "Charlie", "Bangalore", 90000, Arrays.asList("Java", "Microservices"), "IT"),
                new Employee(4, "David", "Pune", 50000, Arrays.asList("HR", "Recruitment"), "HR"),
                new Employee(5, "Eve", "Hyderabad", 70000, Arrays.asList("Finance", "Excel"), "Finance")
        );
        //Group by department and average salary
        Map<String,Double> map =employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(map);
        //group by department and lowest paid employee in eac department
        Map<String, Optional<Employee>> map1= employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(map1);

        //group by department and total salary

        Map<String,Double> map3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)));
        System.out.println(map3);

        // group by department and minimum salary in each department

        Map<String,Optional<Employee>> map4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));

        map4.forEach((department,salary)->System.out.println(department
        +"->" + (salary.isPresent()?salary.get().getSalary():"N/A")));

        Map<String,Double> map5 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                                emp -> emp.map(Employee::getSalary).orElse(0.0)
                        )
                ));

        System.out.println(map5);
     }

}
