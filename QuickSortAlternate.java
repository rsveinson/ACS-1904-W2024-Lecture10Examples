import java.util.Random;
/** 
 * ACS-1904 Alternate Quick Sort Implementation
 * @author: Sveinson
 */

public class QuickSortAlternate{
    public static void main(String[] args) {
        final int MAX = 25;         // max size of the array
        final int UPPER = 1000;      // upper bound on the range of random numbers
        
        // some variables and the array
        int[] list = new int[MAX];
        int len = MAX;                   // actual size of the array in case it is not full
        
        Random rnd = new Random();
        
        // populate the array with lots of random ints
        for(int i = 0; i < MAX; i++)
            list[i] = rnd.nextInt(UPPER) + 1;
            
        // print the unsorted list
        printList(list, len);
        
        // sort the list using the quick sort method
        quickSort(list, 0, len -1);
        
        // print the sorted list
        printList(list, len);

        System.out.println("end of program");
    }

    public static void quickSort(int[] l, int left, int bigIndex){
        int right = bigIndex;       // be careful here, 
        //System.out.println("big index = " + right);       
        int index = intPartition(l, left, right);

        if(left < index - 1)
            quickSort(l, left, index - 1);

        if(right > index)
            quickSort(l, index, right);

    } // end intQuickSort

    private static int intPartition(int l[], int low, int high){
        int pivot = l[(high + low) / 2];                       // find the middle index for pivot
        //int pivot = l[high];
        int i = low;
        int j = high;

        while(i <= j){
            // find a value left of pivot greater than pivot
            // and a value right of pivot less than pivot
            while(l[i] < pivot){
                i++;                        // move up to the next index
            } // end while l[i] < l[pivot]

            while(l[j] > pivot){
                j--;                        // move down to the next index
            } // end while l[j] > l[pivot]

            // only call swap if the low index is less than the high index
            // i.e. the indices haven't crossed
            if(i <= j){
                swap(l, i, j);
                i++;
                j--;
            }// end if i <= j
        } // end while i < j
        //swap(l, i, high);

        return i;
    } // end inPartition

    public static void swap(int[] l, int i, int j){
        int temp = l[i];
        //  i = j;
        //  j = i;

        //System.out.println(l[i] + " " + l[j]);
        
        // swap the conventional way
        l[i] = l[j];
        l[j] = temp;
        
        // bit wise xor cooler
        // l[i] = l[i] ^ l[j];
        // l[j] = l[i] ^ l[j];
        // l[i] = l[i] ^ l[j];
        
        // System.out.println(l[i] + " " + l[j]);
    } // end swap

    public static void printList(int[] l, int len){
        for(int i = 0; i < len; i++)
            System.out.println(i + ": " + l[i]);
    }// end printList
    

}
