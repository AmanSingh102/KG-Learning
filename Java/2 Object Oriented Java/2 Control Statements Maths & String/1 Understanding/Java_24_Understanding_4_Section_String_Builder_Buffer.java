public class Java_24_Understanding_4_Section_String_Builder_Buffer 
{
    public static void main(String[] args) 
    {
        System.out.println("\n---- StringBuilder and StringBuffer Understanding ----\n");

        StringBuilder addStringBuilder = new StringBuilder("First");
        addStringBuilder.append(1);
        addStringBuilder.append("Second");
        addStringBuilder.append(99.9);

        System.out.println("\n------------------------------------------------------\n");
    }

    @Override
    public String toString() {
        return "Java_24_Understanding_4_Section_String_Builder_Buffer []";
    }
}