package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_3_Polymorphism.Java_5_Final_Keyword;

class Testing
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.start();

        Plane plane = new Plane();
        plane.start();

        System.out.println("\n---- Meaning of runtime understanding ----\n");
        castTest(car);
        castTest(plane);
    }

    private static void castTest( Vehicle vehicle )
    {
        vehicle.start();
        /*  ess reference me object kon sa hai wo run karega
            ye runtime pe hi pata chalega
            ye compiler nhi pata kar sakta     */
    }
}
