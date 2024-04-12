class Student
{
    String name;
    int age;
    int rollNo;

    Student( String name, int rollNo, int age )
    {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public String toString() 
    {
        return 
                "\nStudent Detail :- " +
                "\nStudent name = " + name + 
                "\nStudent roll no. " + rollNo +
                "\nStudent age = " + age + "\n";
    }    
}

public class Java_26_Show_Student_Detail_Using_String 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Showing Student Details Using To String ----\n");
        Student s1 = new Student("Shreya", 32, 18);
        System.out.println(s1);
        System.out.println("\n-------------------------------------------------\n");
    }    
}
