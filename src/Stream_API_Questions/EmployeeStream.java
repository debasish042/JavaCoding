package Stream_API_Questions;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Bangalore", 80000, Arrays.asList("Java", "Spring"), "IT"),
                new Employee(2, "Bob", "Hyderabad", 60000, Arrays.asList("JavaScript", "React"), "IT"),
                new Employee(3, "Charlie", "Bangalore", 90000, Arrays.asList("Java", "Microservices"), "IT"),
                new Employee(4, "David", "Pune", 50000, Arrays.asList("HR", "Recruitment"), "HR"),
                new Employee(5, "Eve", "Hyderabad", 70000, Arrays.asList("Finance", "Excel"), "Finance")
        );
        /*//Print each employee
        employees.forEach(System.out::println);*/
        // employee with highest salary
        /*Employee highest = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println(highest);*/

        //group employees by department

/*        Map<String,List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        map.forEach((k,v)->System.out.println(k+":"+v));*/

        //flatten skills list

        /*List<String> skills = employees.stream()
                .flatMap(e->e.getSkills().stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(skills);*/

        //find employee with particular skills

        /*List<Employee> list1 = employees.stream()
                .filter(e->e.getSkills().contains("Java"))
                .collect(Collectors.toList());
        System.out.println(list1);*/

        //find average salary

       /* double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println("Average salary: " + averageSalary);*/

        //count employees per department

        /*Map<String,Long> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        map.forEach((k,v)->{System.out.println(k+": "+v);});*/
       //Highest paid employee of each department
        /*Map<String, Optional<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        result.forEach((key, value) -> System.out.println(key + " : " + value));
        */
    }
}
