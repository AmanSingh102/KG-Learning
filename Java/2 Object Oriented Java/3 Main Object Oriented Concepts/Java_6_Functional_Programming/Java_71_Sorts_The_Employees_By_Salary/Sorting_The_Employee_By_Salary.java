package Java_6_Functional_Programming.Java_71_Sorts_The_Employees_By_Salary;

import java.util.Comparator;
import java.util.List;

public class Sorting_The_Employee_By_Salary
{
    public static void main(String[] args)
    {
        List< Employee > myEmployees = List.of
                (
                    new Employee("Aman",200),
                    new Employee("Suhani",5000),
                    new Employee("Rashmeet",2000),
                    new Employee("Sweta",20000),
                    new Employee("Harsh",15000)
                );

        myEmployees.stream()
                .sorted( ( emp1,emp2 ) -> emp1.getSalary() -  emp2.getSalary())
                .forEach(System.out::println);
    }
}
