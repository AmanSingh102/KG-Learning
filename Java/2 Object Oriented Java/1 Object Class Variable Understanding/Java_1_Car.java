public class Java_1_Car 
{
    // ---- Code Block Understanding ---- 
    static int noOfCarSold;
    // ---- Code Block Understanding ---- 

    int noOfWheels;
    String color;
    String nameOFTheCar;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public void start()
    {
        if( currentFuelInLiters == 0 )
        {
            System.out.println("Car is out of fuel !!!, can not be start");
        }
        else if( currentFuelInLiters < 5 )
        {
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInLiters --;
        }
        else
        {
            System.out.println("Car is started... bruhhh !!!");
            currentFuelInLiters --;
        }
    }

    // this keyword understanding  --- instance method use karne le liye ko current object call kar raha hai
    public Java_1_Car startWithThisKeyword()
    {
        if( currentFuelInLiters == 0 )
        {
            System.out.println("Car is out of fuel !!!, can not be start");
        }
        else if( currentFuelInLiters < 5 )
        {
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInLiters --;
        }
        else
        {
            System.out.println("Car is started... bruhhh !!!");
            currentFuelInLiters --;
        }

        return this;
    }

    public void drive()
    {
        currentFuelInLiters --;
        System.out.println("Car is driving...");
    }

    public void addFuel( float fuel )
    {
        currentFuelInLiters = currentFuelInLiters + fuel;
    }

    // this keyword understanding  --- instance varisable use karne le liye ko current object call kar raha hai
    public void addFuelWithUsingThisKeyword( float currentFuelInLiters )
    {
        this.currentFuelInLiters = currentFuelInLiters + currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
    // this keyword understanding  ---

    // CONSTRUCTOR understanding
    // Java_1_Car()                  // Default Constructor
    // {
    //     noOfWheels = 4; 
    //     color = "Black";
    //     maxSpeed = 150;
    //     currentFuelInLiters = 2;
    //     noOfSeats = 5;
    // }

    Java_1_Car( String color )    // Parameterized Constructor
    {
        noOfWheels = 4; 
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Java_1_Car()                  // baki variable waise hi initialised ho color mera wala ho
    {
        this("Black");
        currentFuelInLiters = 5;   // can be changed the value
    }
    // CONSTRUCTOR understanding



    // ---- Code Block Understanding ----
    static                                   //  ye pheli bar class load hote samaye call hoga
    {
        noOfCarSold = 0;
        System.out.println("I am in static block");
    }

    {                                        // sabse phele ye call hota is constructor se v phele                     
        noOfCarSold++;
        System.out.println("I am in initialisation block");
    }
    // ---- Code Block Understanding ----   


    // ---- Finalizied Understanding ----
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("I am in Finalize");
    }
    // ---- Finalizied Understanding ----
}   
