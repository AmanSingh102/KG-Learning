package Java_4_Collection_And_Generics.Java_00_Understanding.Java_2_Wrapper_Classes;

public class Understanding_Wrapper_Classes
{
    public static void main(String[] args)
    {
        //Integer firstNum = new Integer(55);  OLD METHOD NOT USED BY JAVA NOW

        Integer firstNum = Integer.valueOf("55");   // SIMPLE METHOD
        Integer SecondNum = 55;                       // MODIFIED METHOD ( AUTOMATIC CONVERSION ) ( CALLED AUTOBOXING )

        System.out.println(SecondNum.compareTo(firstNum));

        Integer thirdNum = 10;
        System.out.println("AUTOBOXING : " + thirdNum);
        int fourthNum = thirdNum;           // ( CALLED UNBOXING )
        System.out.println("UNBOXING : " + fourthNum);
    }
}
