import java.util.LinkedList;

// PRE: num is a non-null LinkedList of Integers.
// POST: The elements in num are rearranged in non-descending order.
     
public class InsertionSort {

    public static void insertionSort(LinkedList<Integer> num) {
        int i, j, key;
        boolean insertionNeeded = false;

        for (j = 1; j < num.size(); j++) { //num.length changed to num\.size()
            key = num.get(j); //changed structural from num(j) --> num.get(j)
            insertionNeeded = false;

            for (i = j - 1; i >= 0; i--) {
                if (key < num.get(i)) {
                    num.set(i + 1, num.get(i)); // shift right
                    insertionNeeded = true;
                } else {
                    break;
                }
            }

            if (insertionNeeded) {
                num.set(i + 1, key); // insert key
            }
        }
    }
}