package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiLesson {
    public static void main(String[] args) {

        List<String> names = List.of("Anna", "bob", "Alex");


//        List<String> result=names.stream()
//                .filter(name-> name.startsWith("A"));

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int r1 = 0;
        for (int num : numbers) {
            r1 += num;
        }
        System.out.println(r1);


        int totalSum = numbers.stream().
                mapToInt(num -> num).sum();
        System.out.println(totalSum);

        int totalElements = (int) numbers.stream().count();
        System.out.println(totalElements);

        numbers.stream().min(Integer::compareTo)
                .ifPresent(System.out::println);

        List<String> list = List.of("one", "two", "three", "hello", "four", "five");


        List<Employee> employees = List.of(
                new Employee(1, "Alice", 28, 3000, "IT"),
                new Employee(2, "Bob", 35, 4000, "HR"),
                new Employee(3, "Charlie", 40, 5000, "Finance"),
                new Employee(4, "David", 25, 3500, "IT"),
                new Employee(5, "Eva", 30, 4200, "Marketing"),
                new Employee(6, "Frank", 45, 6000, "Finance"),
                new Employee(7, "Grace", 32, 4100, "HR"),
                new Employee(8, "Henry", 29, 3900, "IT"),
                new Employee(9, "Isabel", 38, 4500, "Marketing"),
                new Employee(10, "Jack", 27, 3600, "IT")
        );

        List<Employee> employees1 = employees.stream()
                .filter(s -> s.getDepartment().equalsIgnoreCase("IT"))
                .collect(Collectors.toList());
        System.out.println(employees1);

        Map<String,List<Employee>> employeesByDepartments=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));



        employeesByDepartments.forEach((department, list1) -> {
            list1.forEach(System.out::println);
        });





    }
}
