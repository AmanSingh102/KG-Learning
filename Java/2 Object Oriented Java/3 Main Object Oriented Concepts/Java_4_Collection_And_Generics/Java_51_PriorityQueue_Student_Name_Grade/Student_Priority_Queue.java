package Java_4_Collection_And_Generics.Java_51_PriorityQueue_Student_Name_Grade;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Student_Priority_Queue
{
    public static void main(String[] args)
    {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>()
        {
            @Override
            public int compare(Student student, Student t1)
            {
                return student.getGrade() - t1.getGrade();
            }
        });

        queue.offer(new Student("Aman Singh",'B'));
        queue.offer(new Student("Suhani Mehta",'A'));
        queue.offer(new Student("Anish Kumar",'C'));
        queue.offer(new Student("Subham Kumar",'B'));
        queue.offer(new Student("Sweta Kumari",'D'));
        queue.offer(new Student("Sonu Kumar",'A'));
        queue.offer(new Student("Rashmeet Singh",'C'));
        queue.offer(new Student("Ikar Kumari",'A'));

        System.out.printf("Queue is %s",queue);
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
    }

    private static class Student
    {
        private final String name;
        private final char grade;

        public Student(String name, char grade)
        {
            this.name = name;
            this.grade = grade;
        }

        public String getName()
        {
            return name;
        }

        public char getGrade()
        {
            return grade;
        }

        @Override
        public String toString() {
            return name + " : " + grade;
        }
    }
}
