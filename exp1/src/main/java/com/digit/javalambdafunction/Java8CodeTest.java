package com.digit.javalambdafunction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8CodeTest {
    public static void main(String[] args) {

        List<Employee> employees=EmployeeHypoDatabase.getAllEmployees();

        //apply foreach
        //employees.forEach(e-> System.out.println(e.getName()+" : "+e.getSalary()));
        //employees.forEach(System.out::println);
        //employees.stream().forEach(System.out::println);

        Map<String, Double> developmentRole = employees.stream().filter(
                e -> e.getDept().equals("Development") && e.getSalary() > 25000).collect(Collectors.toMap(Employee::getName, Employee::getSalary));
       // System.out.println("Employee in development role " + developmentRole);

        //Stream
        //Distinct
        List<String> listOfDepts = employees.stream()
                .map(Employee::getDept)
                .distinct()
                .toList();
        //System.out.println(listOfDepts);

        List<String> listOfDepts1 = employees.stream()
                .map(Employee::getDept)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listOfDepts1);


    }
}
