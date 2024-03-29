public class Java_3_Design_Course 
{
    static int maxCapcity = 100;

    String courseName;
    int enrollments;

    String[] enrolledStudent;

    Java_3_Design_Course( String courseName )
    {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudent = new String[maxCapcity];
    }

    static void setMaxCapacity( int maxCapacity )
    {
        Java_3_Design_Course.maxCapcity = maxCapacity;
    }

    void enrollStudent( String studentName )
    {
        enrolledStudent[enrollments] = studentName;
        enrollments ++;
    }

    void unenrollStudent( String studentName )
    {
        System.out.println("Student removed");
        enrollments --;
    }
}
