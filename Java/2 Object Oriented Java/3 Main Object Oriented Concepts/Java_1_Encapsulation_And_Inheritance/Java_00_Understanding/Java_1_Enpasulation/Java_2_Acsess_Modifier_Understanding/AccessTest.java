package Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_1_Enpasulation.Java_2_Acsess_Modifier_Understanding;

public class AccessTest
{
    public static void main(String[] args)
    {
        System.out.println();
        Car car = new Car();
        car.color = "Red";
        car.model = "Mercedes";
        car.costOfPurchase = 3000;
        System.out.println(car);

        System.out.println();
        Car newCar = new Car("Black","BMW",2,32000);
        System.out.println(newCar);

        System.out.println();
        Default def = new Default();
        System.out.println(def);
    }
}
