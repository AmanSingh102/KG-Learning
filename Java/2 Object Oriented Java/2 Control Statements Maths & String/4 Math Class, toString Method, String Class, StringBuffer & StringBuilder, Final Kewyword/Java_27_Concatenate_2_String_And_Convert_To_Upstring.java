public class Java_27_Concatenate_2_String_And_Convert_To_Upstring 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- Concatenate Two String And Convert To UpString ----\n");

            String firstName = "Moya";
            String lastName = "Prasad";
            //String fullNmae = firstName + " " + lastName;

            String fullNmae = firstName.concat(" ").concat(lastName);
            System.out.println(fullNmae);

            System.out.println(fullNmae.toUpperCase());

        System.out.println("\n--------------------------------------------------------\n");
    }   
}
