public class Java_2_Book 
{
    static int totalNumberOfBooks;

    String author;
    String title;
    String uniqueNumber;    
    boolean isBorrowed;

    static
    {
        totalNumberOfBooks = 0;
    }
    {
        totalNumberOfBooks ++;
    }

    Java_2_Book( String uniqueNumber, String title, String author )
    {
        this.uniqueNumber = uniqueNumber;
        this.title = title;
        this.author = author;
    }

    Java_2_Book( String uniqueNumber )
    {
        this( uniqueNumber,"Unknown","Unknown");
    }

    static int getTotalNoOfBooks()
    {
        return totalNumberOfBooks;
    }

    void borrowBook()
    {
        if( isBorrowed )    
        { 
            System.out.println("Book is already borrowed"); 
        }
        else
        {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }
 
    void returnBook()
    {
        if( isBorrowed )
        {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed. please leave a review");
        }
        else
        {
            System.out.println("This book is already in the library");
        }
    }


    public static void main(String[] args) 
    {
        Java_2_Book fearBook = new Java_2_Book("1","Fear","Raju");
        Java_2_Book stressBook = new Java_2_Book("2");

        System.out.println(Java_2_Book.getTotalNoOfBooks());
        fearBook.borrowBook();
        stressBook.borrowBook();

        fearBook.borrowBook();
        fearBook.returnBook();
        fearBook.returnBook();   
    }
} 