package Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_2_Inheritance;

import Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_2_Inheritance.Protected_Modifier_Understanding.Vehicle;

public class Two_Wheeler extends Vehicle
{
    Two_Wheeler()
    {
        setNoOfBrakes(2);      // SET BY SETTER
        noOfTires = 3;        // ACCESS THROUGH PROTECTED MODIFIER
    }

    public void balance()
    {
        System.out.println("I am balancing on two tires");
    }
}
