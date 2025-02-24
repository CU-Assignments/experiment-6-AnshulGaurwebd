// 22bcs13276_Anshul Gaur

import java.util.*;

class Employee {
    protected String name;
    protected int age;
  protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Ana", 30, 50000),
            new Employee("ans", 25, 60000),
            new Employee("anusl", 35, 55000)
        );
        
        employees.sort(Comparator.comparing((Employee e) -> e.name)
                .thenComparing(e -> e.age)
                .thenComparing(e -> e.salary));
        
        employees.forEach(System.out::println);
    }
}
