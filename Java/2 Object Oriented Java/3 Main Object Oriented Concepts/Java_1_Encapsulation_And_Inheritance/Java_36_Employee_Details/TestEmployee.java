package Java_1_Encapsulation_And_Inheritance.Java_36_Employee_Details;

public class TestEmployee
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Aman Singh", 17,25000);
        System.out.println(emp1.getEmployeeDetails());

        emp1.setName("Rahu");
        System.out.println(emp1.getEmployeeDetails());
    }
}
