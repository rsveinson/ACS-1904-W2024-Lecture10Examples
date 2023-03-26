import java.util.Random;
/** 
 * ACS-1904 Alternate Quick Sort Implementation
 * @author: Sveinson
 */

public class QuickSortHighPivot{
    public static void main(String[] args) {
        final int MAX = 10;         // max size of the array
        final int UPPER = 100;      // upper bound on the range of random numbers
        
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
        //the pivot value will be the rightmost value i.e. the highest index
        // the argument on the first call to the quicksort method has to be n-1
        int pivot = l[high];
        
        // the positoin of the pivot is undefined at this point i.e. the lowest index - 1
        int pivotSpot = low - 1;

        for(int i = low; i < high; i++){
            if(l[i] <= pivot){
               pivotSpot++;
               swap(l, pivotSpot, i); 
            }// end if l[i] < = pivot
        }
        
        swap(l, pivotSpot + 1, high);

        return pivotSpot + 1;
    } // end inPartition

    public static void swap(int[] l, int i, int j){
        int temp = l[i];
        //  i = j;
        //  j = i;

        l[i] = l[j];
        l[j] = temp;
    } // end swap

    public static void printList(int[] l, int len){
        for(int i = 0; i < len; i++)
            System.out.println(i + ": " + l[i]);
    }// end printList
    

}
