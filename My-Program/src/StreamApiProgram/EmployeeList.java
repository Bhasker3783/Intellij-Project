package StreamApiProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeList {

        private int id;
        private String name;
        private String department;
        private double salary;

    public static void main(String[] args) {
        List<EmployeeList> employees = Arrays.asList(
                new EmployeeList(101,"Bhasker","IT",600000),
                new EmployeeList(102,"bhanu","HR",750004),
                new EmployeeList(103,"Raj","Monitoring",25000),
                new EmployeeList(104,"jay","IT",560000),
                new EmployeeList(105,"Rajesh","HR",35000)
        );
        //Taking out the list of employees who's salary is more then 30000
        List<String> empname = employees.stream().filter(e->e.getSalary()>=30000)
                .map(e->e.getName())
                .collect(Collectors.toList());
        System.out.println(empname);

        //grouping the employees with their dept
        Map<String,List<EmployeeList>> deprtmap = employees.stream()
                .collect(Collectors.groupingBy(e->e.getDepartment().toLowerCase()));
        System.out.println(deprtmap);

        //Running for each loop for readability
        deprtmap.forEach((dept,empList)->{
            System.out.println("Name of department: " + dept.toLowerCase());
            empList.forEach(emp1->{
                System.out.println("emp ---"+emp1);
            });
        });

        }



    public EmployeeList(int id, String name, String department, double salary) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
    // Constructor, Getters, and toString
   } 

