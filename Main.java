import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Q1 part a. instantiating the Queue and adding 10 integers
        Queue <Integer> queue = new Queue<>();
        for (int i=1; i<=10; i++){
            queue.offer(i);
        }

        System.out.println("\nDISPLAYING ELEMENTS:");
        System.out.println("---------------------");

        for (int i=0; i< queue.size(); i++) {
            int val = queue.peek();
            System.out.print(val + " ");
            queue.offer(queue.poll()); //adding the removed element back to queue to keep data in it
        }
        System.out.println();
        
        // part c || Moving front element to rear
        System.out.println("\nMovingToRear Showcase:");
        queue.moveToRear();

        System.out.println("Queue after moveToRear:");
        for (int i = 0; i < queue.size(); i++) {
            int val = queue.peek();
            System.out.print(val + " ");
            queue.offer(queue.poll());
        }
        System.out.println();


         //Q2: RECURSIVE SEARCH 
         //semi hard code
        
        System.out.println("\nQ2: Recursive Last Occurrence");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(52);
        list.add(75);
        list.add(77);
        list.add(21);
        list.add(76);
        list.add(77);
        list.add(75);

        System.out.println("ArrayList: " + list);

        int target = 77; //fixed/hard code 
        int result = RecursiveSearch.lastOccurrence(list, target, list.size() - 1);

        
        System.out.println("Target value: " + target);
        System.out.println("Last occurrence index: " + result);

        //another test case
        int newTarget = 75;
        int newResult = RecursiveSearch.lastOccurrence(list, target, list.size() - 1);

        System.out.println("\nSecond target value: " + newTarget);
        System.out.println("Last occurrence index: " + newResult);

        // Q3: INSERTION SORT

        System.out.println("\nQ3: Insertion Sort (LinkedList)");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(65);
        linkedList.add(23);
        linkedList.add(2000);
        linkedList.add(101);
        linkedList.add(89);
        linkedList.add(89);
        linkedList.add(2);
        linkedList.add(0);
        System.out.println("Before sorting: " + linkedList);

        InsertionSort.insertionSort(linkedList);

        System.out.println("After sorting:  " + linkedList);
    }
}
