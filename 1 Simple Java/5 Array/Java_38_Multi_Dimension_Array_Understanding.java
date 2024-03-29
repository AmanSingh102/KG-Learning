public class Java_38_Multi_Dimension_Array_Understanding
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- 2D Array Understanding ----\n");   
        Multi2DArray();
    }

    public static void Multi2DArray() 
    {
        int[][] arr = { { 1,2,3 }, { 4,5,6 }, { 7,8,9 } };
        System.out.println("Size of an Array ( arr ) : " + arr.length + "\n");

        // THIS IS CALLED TRAVERSAL 
        for( int i = 0; i < arr.length; i++ )
        {
            for( int j = 0; j < arr[i].length; j++ )
            {
                System.out.print( " " + arr[i][j] + " " );
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------\n");
    }
}
