package com.jdc;

import java.util.Comparator;
import java.util.List;

record Employee(String id, String name, String department, double salary){}

public class DistinctAndSortedSample {
    Comparable com;
    Comparator comtor;
    static void main() {
        Comparator t;
        List<Employee> employees = List.of(
                new Employee("E01","Kyaw Kyaw","Engineering",1500),
                new Employee("E02", "Su Su","HR",1100),
                new Employee("E03", "Aung Aung","Engineering",1800),
                new Employee("E01", "Kyaw Kyaw", "Engineering",1500),
                new Employee("E04", "Hla Hla", "HR",1300)
        );

        employees.stream()
                .distinct()
                //.sorted((e1,e2)-> e1.department().compareTo(e2.department()))
                .sorted(Comparator.comparing(Employee::department)
                        .thenComparing(Comparator.comparingDouble(Employee::salary)
                                .reversed()))
                .forEach(System.out::println);


    }
}
