package Java_1_Encapsulation_And_Inheritance.Java_00_Understanding.Java_1_Enpasulation.Java_3_Getter_And_Setter_Understanding;

public class Car
{
    private String color;               // public
    private String model;               // public
    private double fuelLevel;
    private long costOfPurchase;        // default

    public Car(String color, String model, double fuelLevel, long costOfPurchase)
    {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        if(color.equals("\"Yellow\""))
        {
            System.out.println("Main nhi karunga Moye Moye !!!");
        }
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
