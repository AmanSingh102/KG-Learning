package Java_1_Encapsulation_And_Inheritance.Java_39_Operate_Array;

public class TestArrayOperation
{
    public static void main(String[] args)
    {
        ArrayOperations ap = new ArrayOperations( new int[] { 1,2,3,4 });
        ArrayOperations.Statistics statistics = ap.new Statistics();

        System.out.println("Mean = " + statistics.mean());

    }
}
