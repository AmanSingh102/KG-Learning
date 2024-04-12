package Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_2_Inheritance;

import Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_2_Inheritance.Protected_Modifier_Understanding.Vehicle;

public class Inheritance_Test
{
    public static void main(String[] args)
    {
        System.out.println("\nVehicle ----------------->");
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        System.out.println("\nTwo Wheeler ----------------->");
        Two_Wheeler bike = new Two_Wheeler();
        bike.commute();
        bike.balance();

        System.out.println("\nMotor Cycle ----------------->");
        Motor_Cycle honda = new Motor_Cycle();
        honda.commute();
        honda.balance();
        honda.start();

        System.out.println("\n---- The Parent Class is by Default inherit the Object Class ----\n ");
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
        System.out.println("\n-----------------------------------------------------------------\n ");
    }
}
