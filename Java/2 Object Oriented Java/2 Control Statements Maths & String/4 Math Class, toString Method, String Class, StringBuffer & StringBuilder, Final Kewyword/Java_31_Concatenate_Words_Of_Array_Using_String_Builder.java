public class Java_31_Concatenate_Words_Of_Array_Using_String_Builder 
{
    public static void main(String[] args) 
    {
        System.out.println("\n----  Concatenate_Words_Of_Array_Using_String_Builder ----\n");
        
        String[] array = new String[] { " Chipi", "Chipi\n", 
                                        "Chapa", "Chapa\n", 
                                        "Dubi", "Dubi\n", 
                                        "Daba", "Daba\n", 
                                        "Micogi Dubi Dubi\n", 
                                        "Boom",
                                        "Boom", 
                                        "Boom",
                                        "Boom\n", 
                                        "!!!"               };   

        StringBuilder sb = new StringBuilder();
        
        for(String str : array) 
        {
            sb.append(str).append(" ");
        }

        System.out.println(sb);

        System.out.println("\n----------------------------------------------------------\n");
    }   
}
