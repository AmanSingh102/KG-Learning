package Java_1_Encapsulation_And_Inheritance.Java_39_Operate_Array;

public class ArrayOperations
{
    private int[] numArray;

    public ArrayOperations(int[] numArray)
    {
        this.numArray = numArray;
    }

    public class Statistics
    {
        double mean()
        {
            double sum = 0;
            for (int i : numArray)
            {
                sum = sum + i;
            }
            return sum/numArray.length;
        }

        double medium()
        {
            // operation do yourself okay !!! Hint sort the Array and Find the middle element
            return 0;
        }
    }
}
