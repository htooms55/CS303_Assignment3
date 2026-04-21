public class Queue<E> {
    private static class Node<E>{
        E data;
        Node<E> next;

        Node (E data) {
            this.data = data;
        }
    }
    private Node<E> front;
    private Node<E> rear;
    private int size = 0;

    public Queue() {
        front = null;
        rear = null;
        size = 0;

    }

    // adding element to the end of the linkedlist/Queue (rear)
    // item is added to rear and size increased by 1
    public void offer (E item) {
        Node newNode = new Node(item);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // PRE: item to be removed from front/head
    //POST: The front element is removed and returned. size decreases by 1.
    //      Returns null if the queue is empty.
     
    public E poll () {
        if (empty()) { //checking to see if list is empty
            return null;
        }

        E data = front.data; // obtaining the data/element at the front/head of the list
        //Node<E> oldFront = front;
        front = front.next; //re-pointing the front/head to the next node of the list 

        if (front == null) {
            rear = null;
        }
        size--;
        return data; //returns the remove item (the head)
    }

    //check if Queue is not empty, 
    // if not, then poll (remove) the head/front, then add it back at the end
    public void moveToRear() {
        if (!empty()) {
            E temp = poll();
            offer(temp);
        }
    }

    //simple peek 
    public E peek() {
        if (empty()){
            return null;
        }
        return front.data;
    }
    

    // checker for empty list and whatnot
    public boolean empty() {
        return size == 0;
    }

    //simple size 
    public int size() {
        return size;
    }



    
}
