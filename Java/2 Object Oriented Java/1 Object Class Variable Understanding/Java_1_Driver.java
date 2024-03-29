public class Java_1_Driver 
{
    // --------- static kwyword understanding ---------
    String name;
    int age;
    String dateOfLicence; 

    static int minAgeOfDriving = 18;

    public boolean isAllowedToDrived()   
    {
        return this.age >= minAgeOfDriving;
    }
       /* static variable ko static me use kar paye 
          aur non - static v kar paye

          lekin non - static ko static me use nhi kar sakte
       */

    // --------- static kwyword understanding ---------

    public static void main(String[] args) 
    {
        Java_1_Car BMW = new Java_1_Car();
        System.out.println(BMW.nameOFTheCar = "\nBMw");
        BMW.addFuel(6);
        BMW.drive();
        BMW.drive();
        BMW.drive();
        BMW.addFuel(3);
        BMW.drive();
        System.out.println(BMW.getCurrentFuelLevel());
        System.out.println();




        System.out.println("// this keyword understanding -------------");
        Java_1_Car swift = new Java_1_Car();
        System.out.println("---- Calling the start with same class name with using /this/ keyword ----");
        System.out.println(swift.nameOFTheCar = "Swift");
        swift.addFuel(6);
        Java_1_Car startedCar = swift.startWithThisKeyword();
        startedCar.drive();
        
        //For understanding comment the above code
        swift.startWithThisKeyword().drive();       // directly call





        System.out.println("\n// --------- static keyword understanding ---------");
        Java_1_Driver driver1 = new Java_1_Driver();
        driver1.dateOfLicence = "1/MAR/2002";  // you can't do that like that [ dateOfLicence = "1/MAR/2002"; ]

        // Jab koi variavle static ban jayega to access kar sakte ho
        System.out.println("This is an static variable : " + minAgeOfDriving);  
        // main method static hai aur variable static es karan access kar pa rahe ho
  
        //System.out.println(driver1.minAgeOfDriving);         // esse v accessable hai
        System.out.println(Java_1_Driver.minAgeOfDriving);   // esse v accessable hai





        System.out.println("\n// --------- Constructor Understanding ---------");
        System.out.println("\n// Default Constructor");
        Java_1_Car maruti = new Java_1_Car();      // Default Constructor
        maruti.startWithThisKeyword().drive();
        System.out.println(maruti.color);

        System.out.println("\n// Parameterized Constructor");
        Java_1_Car kia = new Java_1_Car("Red");      // Parameterized Constructor
        kia.startWithThisKeyword().drive();
        System.out.println(kia.color);
    }
}
