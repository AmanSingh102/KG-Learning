package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_3_Polymorphism.Java_1_References_And_Objects;

public class ReferencesAndObjectsTest
{
    public static void main(String[] args)
    {
        Child child = new Child();
        //Parent parent = new Parent();
        ChildOfChild childOfChild = new ChildOfChild();

        Parent pChild = new Child();            // Upcasting
        //Child cParent = (Child) new Parent();   // Try to Downcast

        Object ref  = new Child();
        Object ref2 = new Child();

        //castTest(parent);
        castTest(child);
        castTest(childOfChild);
    }

    public static void castTest( Parent par )
    {
        //object.say();

        // if you confirm that this class is child then you can do downcast
        //Child cParent = (Child) object;
        //cParent.say();
        //cParent.ageOfChild();

        par.say();

//        if( par instanceof  Child )
//        {
//
//        }

    }
}
