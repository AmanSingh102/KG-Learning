package Java_1_Encapsulation_And_Inheritance.Java_36_Employee_Details;

public class Employee
{
    private String name;
    public  int age;
    private  double salary;

    Employee(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(byte age)
    {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String getEmployeeDetails()
    {
        return  "\nEmployee Details :-" +
                "\nName : " + name +
                "\nAge : " + age +
                "\nSalary : " + salary ;
    }
}
