package Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_3_Equals;

public class Equals_And_HashCode_Test
{
    public static void main(String[] args)
    {

        Person person1 = new Person("Aman",17,"1234");
        Person person2 = new Person("Aman",17,"1234");
        Person person3 = new Person("Aman",18,"1234");

        // Now, we check the equality of both persons [ dono person ek to nhi hai ? ]
        if( person1.equals( person2 ) )
        {
            System.out.println("Both persons are equal");
        }
        else
        {
            System.out.println("Both persons are NOT equal");
        }

        if( person2.equals( person3 ) )
        {
            System.out.println("Both persons are equal");
        }
        else
        {
            System.out.println("Both persons are NOT equal");
        }
    }
}
