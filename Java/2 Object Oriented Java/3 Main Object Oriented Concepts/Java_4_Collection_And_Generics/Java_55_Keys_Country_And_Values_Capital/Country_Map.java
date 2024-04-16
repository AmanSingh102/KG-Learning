package Java_4_Collection_And_Generics.Java_55_Keys_Country_And_Values_Capital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country_Map
{
    public static void main(String[] args)
    {
        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("Bharat","New Delhi");
        countryMap.put("China","Beijing");
        countryMap.put("Pakistan    ","Islamabad");
        countryMap.put("SriLanka","Coloumbo");
        countryMap.put("Bangladesh","Dhaka");


        System.out.println("\n---- Country and Capital Program ----\n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Please, enter the name of the country : ");
            String country = sc.next();

            if( countryMap.containsKey(country))
            {
                System.out.printf("Capital of %s is %s",country,countryMap.get(country));
            }
            else
            {
                System.out.printf("Sorry, We don't know the capital of %s",country);
            }

        sc.close();
        System.out.println("\n\n-------------------------------------\n");
    }
}
