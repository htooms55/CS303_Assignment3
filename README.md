# CS303_Assignment3
--Queue (Linked List)--

->Generic Node<E> structure with front and rear pointers for O(1) efficiency.
->moveToRear() calls poll() and then offer() to cycle the front element to the back.
->poll() and peek() return null if the queue is empty to prevent crashes.

--Recursive Search (Last Occurrence)--

->Starts at list.size() - 1 and recurses toward index 0.
->Returns the index of the first match found (which is the last one in the list). Returns -1 if the index reaches -1.

--Insertion Sort (LinkedList)--

->Uses a nested loop to compare a "key" against sorted elements.
->Data Handling: Uses num.get() to retrieve values and num.set() to shift elements right until the correct insertion spot is located.

---How to Run & Modify---
How to Change Values (Modifying Main.java)

To test different scenarios, open Main.java and try these common changes:

-Change Queue Data: In the for-loop for (int i = 1; i <= 10; i++), change i * 10 to any other math or value to see different numbers in the queue.

-Change Search Target: In the lastOccurrence call, change the target parameter (e.g., from 50 to 20) to see if the recursion finds the correct index.

-Add Duplicate Values: Add list.add(10); twice in your search test to verify the code actually finds the last one, not the first.

-Change Sort Input: Add unsorted numbers like num.add(5); num.add(1); num.add(9); to the LinkedList before calling insertionSort to verify the sorting order changes.

<img width="819" height="284" alt="Screenshot 2026-04-21 at 12 10 32 AM" src="https://github.com/user-attachments/assets/9bda950d-23b0-40e8-aecf-3736dc3475ef" />
