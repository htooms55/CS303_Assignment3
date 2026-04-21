import java.util.ArrayList;

/*
 PRE: list is not null. index is the starting point for the search 
        (usually list.size() - 1).
 POST: Returns the index of the last occurrence of target. 
        Returns -1 if target is not found or list is empty.
*/
public class RecursiveSearch {

    public static int lastOccurrence(ArrayList<Integer> list, int target, int index) {
        // Base case
        if (index < 0) {
            return -1;
        }

        // If match found, return index immediately (since we go backwards)
        if (list.get(index) == target) {
            return index;
        }

        // Recursive call
        return lastOccurrence(list, target, index - 1);
    }
}