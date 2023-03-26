import java.util.Arrays;
public class SelectionSortForObjects
/*
 * Modifying Selection sort for int to a selection sort for objects requires:
 *     - the array to be an array of Comparable
 *     - comparisons to be made using the compareTo method
 *     - swapping requires a temp variable of type Object
 */
{
    public static void main(String[] args){
        Duck[] toSort = {new Duck("Hewie", 50), new Duck("Dewie", 60), new Duck("Lewie", 40)};
        
        System.out.println(Arrays.toString(toSort));
        selectionSortForObjects(toSort);
        System.out.println(Arrays.toString(toSort));
        
        System.out.println("end of program");
    }
    
    // note the type of the array parameter
    public static void selectionSortForObjects(Comparable[] a){
        int n = a.length;
        
        // n-1 passes of the unsorted sublist
        for (int i = 0; i < n - 1; i++) {
            // find the index of the smallest element in the unsorted sublist
            // i is the first element in the unsorted list so it is the smallest element
            int iSmallest = i;
            
            // test against successive elements
            for (int j = i + 1; j < n; j++) {
                // update the index of the smallest
                // for objects
                if (a[j].compareTo(a[iSmallest]) < 0) {
                    // found new smallest
                    iSmallest = j;
                }
            }
            
            // swap the smallest element with the start of the unsorted sublist 
            if(iSmallest != i) {
                System.out.println("swapping " + a[i] + " " + a[iSmallest]);
                
                // swapping objects of type Comparable
                Comparable temp = a[i];
                a[i] = a[iSmallest];
                a[iSmallest] = temp;
            }
        }
    }
}