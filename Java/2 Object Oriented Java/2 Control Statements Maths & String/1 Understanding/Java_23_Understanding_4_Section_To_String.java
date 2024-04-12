class Car
{
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;

    String name;
    String modelNumber;
    String company;
    
    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) 
    {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

//    @Override
//    public String toString()      // <-- if you not define this then show after run [ Car@28a418fc ]
//    {
//        return "Car -------->" + "\n" + "noOfWheels = " + noOfWheels + "\n" +
//        "noOfDoors = " + noOfDoors + "\n" +
//        "maxSpeed = " + maxSpeed + "\n" +
//        "name = " + name + "\n" +
//        "modelNumber =" + modelNumber + "\n" +
//        "company = " + company ;
//    }


    @Override
    public String toString() 
    {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


public class Java_23_Understanding_4_Section_To_String 
{
    public static void main(String[] args) 
    {
        Car swift = new Car(4, 4, 200, "Swift", "Sw6565", "Bharti");  
        System.out.println( "\n" + swift.toString() + "\n\nRepresention of an Object ( Also say Address )" + "\n");
    }
}
