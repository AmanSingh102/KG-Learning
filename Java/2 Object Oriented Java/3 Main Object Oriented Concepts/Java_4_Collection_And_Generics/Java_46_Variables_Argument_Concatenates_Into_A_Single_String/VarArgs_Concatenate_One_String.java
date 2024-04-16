package Java_4_Collection_And_Generics.Java_46_Variables_Argument_Concatenates_Into_A_Single_String;

public class VarArgs_Concatenate_One_String
{
    public static String concatenate( String... strings)
    {
        StringBuilder sb = new StringBuilder();
        for (String string : strings)
        {
            sb.append(string).append(" ");
        }

        return sb.toString();
    }


    public static void main(String[] args)
    {
        System.out.println(concatenate("Aman"));
        System.out.println(concatenate("Aman","Kumar"));
        System.out.println(concatenate("Aman","Kumar","Singh"));
        System.out.println(concatenate("Aman","Kumar","Singh","Chauhan"));
    }
}
