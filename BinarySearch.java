import java.util.Arrays;
public class BinarySearch
{
    public static void main(String[] args){
        // the sorted array to be searched
        int[] sorted = {1, 3, 5, 7, 9};        
        System.out.println("array to search: "+Arrays.toString(sorted));
        // exhaustive set of search values
        performSearch(sorted,0);
        performSearch(sorted,2);
        performSearch(sorted,4);
        performSearch(sorted,6);
        performSearch(sorted,8);
        performSearch(sorted,10);
        performSearch(sorted,1);
        performSearch(sorted,3);
        performSearch(sorted,5);
        performSearch(sorted,7);
        performSearch(sorted,9);
    }

    /*
     * Utility method to call binary search 
     * and report results
     */
    public static void performSearch(int[] a, int searchFor){
        int result = binarySearch(a, 0, a.length-1, searchFor);
        if (result >= 0) 
            System.out.println("found "+searchFor+" in position "+result);
        else 
            System.out.println(searchFor+" not found");
    }

    /*
     * binary search of a sorted array
     *   - continuously bisect a list 
     *     looking for search value
     *     - Return -1 if the list is empty,
     *       ... value not found
     *     - determine midpoint of list
     *     - get value at midpoint
     *     - compare midpoint value & search value
     *       - Return midpoint ...value found 
     *       - recursive call with left or 
     *         right sublist
     */
    public static int binarySearch ( int[] a, int start, int end, int searchValue){
        // when called with a sublist that is empty, end is greater than start
        if (start > end) return -1;
        // determine midpoint of sublist 
        // and the value at the midpont
        int midPoint = (start + end) / 2;
        int midValue = a[midPoint];
        
        // check midpoint for value
        if (midValue == searchValue) 
            return midPoint;  // found
        else if (midValue < searchValue) 
            // search left sublist
            return binarySearch(a, midPoint + 1, end, searchValue);
        else // (midValue > searchValue)  
            // search right sublist
            return binarySearch(a, start, midPoint - 1, searchValue);
    }
}
