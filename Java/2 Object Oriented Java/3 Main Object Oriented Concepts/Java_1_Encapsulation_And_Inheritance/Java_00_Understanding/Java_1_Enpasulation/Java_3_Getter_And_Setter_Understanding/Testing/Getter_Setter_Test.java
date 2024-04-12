package Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_1_Enpasulation.Java_3_Getter_And_Setter_Understanding.Testing;
import Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_1_Enpasulation.Java_3_Getter_And_Setter_Understanding.Car;

public class Getter_Setter_Test
{
    public static void main(String[] args)
    {
        Car car = new Car("Red","TATA",2,65000);
        System.out.printf("Color of the Car : %s \nModel of the Car : %s",car.getColor(),car.getModel());
        car.setColor("Yellow");
        System.out.printf("\n\nColor of the Car : %s \nModel of the Car : %s",car.getColor(),car.getModel());
    }
}
