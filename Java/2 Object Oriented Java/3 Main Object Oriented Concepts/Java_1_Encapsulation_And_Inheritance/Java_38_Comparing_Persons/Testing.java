package Java_1_Encapsulation_And_Inheritance.Java_38_Comparing_Persons;

public class Testing
{
    public static void main(String[] args)
    {
        PersonProblem p1 = new PersonProblem("Aman",15);
        PersonProblem p2 = new PersonProblem("Aman",15);
        PersonProblem p3 = new PersonProblem("Aman",16);

        if( p1.equals( p2 ) )
        {
            System.out.println("Both persons are equal");
        }
        else
        {
            System.out.println("Both persons are NOT equal");
        }

        if( p2.equals( p3 ) )
        {
            System.out.println("Both persons are equal");
        }
        else
        {
            System.out.println("Both persons are NOT equal");
        }
    }
}
