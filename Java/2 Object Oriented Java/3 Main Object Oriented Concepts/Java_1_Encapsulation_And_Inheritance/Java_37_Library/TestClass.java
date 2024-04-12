package Java_1_Encapsulation_And_Inheritance.Java_37_Library;

public class TestClass
{
    public static void main(String[] args)
    {
        LibraryItems l = new LibraryItems();
        l.checkout();
        l.returnItem();

        Book b = new Book();
        b.checkout();
        b.returnItem();

        Magazine m = new Magazine();
        m.checkout();
        m.returnItem();

        DVD d = new DVD();
        d.checkout();
        d.returnItem();
    }
}
