package Java_6_Functional_Programming.Java_00_Understanding.Java_2_Stream.Java_1_Filtering;

import java.util.List;
import java.util.function.Consumer;

// YELLOW LINE WALA KO METHOD REFERENCES ME SAMJHO GE OKAY !!
public class Understanding_1_Filter
{
    public static void main(String[] args)
    {
        List<String> fruits = List.of("Apple","Banana","Mango","Cherry","Date");
        System.out.println("\nSize of the fruit list : " + fruits.size());

        System.out.println("\n---- SIMPLE PRINTING METHOD ----");
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }

        System.out.println("\n---- PRINTING USING STREAM ----");
        fruits.stream().forEach(new Consumer<String>()
        {
            @Override
            public void accept(String fruit)
            {
                System.out.println(fruit);
            }
        });

        System.out.println("\n---- PRINTING USING lambda EXPRESSION ----");
        fruits.stream().forEach( fruit -> System.out.println(fruit) );

        System.out.println("\n---- PRINTING USING lambda EXPRESSION UNIFIED ----");
        fruits.forEach(System.out::println);

        System.out.println("\n---- PRINTING USING lambda EXPRESSION AND USING/DOING filter ----");
        fruits.stream()
                .filter( fruit -> fruit.endsWith("e"))
                .forEach( fruit -> System.out.println(fruit) );
    }
}
