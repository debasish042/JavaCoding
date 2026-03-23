package Stream_API_Questions;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String location;
    private double salary;
    private List<String> skills;
    private String department;


    public Employee(int id, String name, String location, double salary, List<String> skills, String department) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.skills = skills;
        this.department = department;
    }

    public Employee(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", skills=" + skills +
                ", department='" + department + '\'' +
                '}';
    }
}
