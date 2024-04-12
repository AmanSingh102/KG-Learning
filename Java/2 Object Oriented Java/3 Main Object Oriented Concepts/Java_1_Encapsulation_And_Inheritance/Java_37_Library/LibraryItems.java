package Java_1_Encapsulation_And_Inheritance.Java_37_Library;

public class LibraryItems
{
    private String itemId;
    private String title;
    private String author;

    public void checkout()
    {
        System.out.println("checkout");
    }

    public void returnItem()
    {
        System.out.println("Returning the item");
    }
}
