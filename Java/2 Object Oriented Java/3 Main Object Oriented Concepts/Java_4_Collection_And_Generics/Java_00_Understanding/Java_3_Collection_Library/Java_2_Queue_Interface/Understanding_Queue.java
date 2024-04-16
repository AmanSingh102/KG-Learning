package Java_4_Collection_And_Generics.Java_00_Understanding.Java_3_Collection_Library.Java_2_Queue_Interface;

import Java_4_Collection_And_Generics.Java_00_Understanding.Java_3_Collection_Library.Java_0_Utility.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class Understanding_Queue
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.offer(20);

        Utility.print(queue);

        System.out.println();
        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println();
        System.out.println(queue.remove() + " is removed");
        Utility.print(queue);

        System.out.println();
        System.out.println(queue.poll() + " is removed");
        Utility.print(queue);                                   // <-- Become Empty

        //System.out.println(queue.remove());                 // <-- throw exception because it will become empty
        System.out.println(queue.poll());                   // <-- but this not an exception its just display Null if the collection is empty
    }
}
