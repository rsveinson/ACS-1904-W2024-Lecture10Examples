import java.util.Arrays;
public class Quicksort
{
    public static void main(String[] args){
        int [] toSort = {6, 5, 9, 0, 11, 8, 4, 10, 2, 1, 12, 7, 3};  
        
        System.out.println("before: "+Arrays.toString(toSort));
        quicksort(toSort, 0, toSort.length-1);
        System.out.println("after:  "+Arrays.toString(toSort));  
        
    }

    public static void quicksort(int[] a, int start, int end){
        // check for list of 0 or 1 elements
        if (start >= end) 
            return;
            
        // the pivot is chosen as the first element
        int pivot = a[start];
        // the list is partitioned into a 
        // left sublist and a right sublist.
        //   left  sublist has values <  pivot.
        //   right sublist has values >= pivot.
        
        int left = start;
        int right = end;
        
        // move larger elements to a right sublist
        // move smaller elements to a left sublist
        while (left < right){
            // search from the right to find 
            //  a value that is less than pivot 
            //  and move it to the left.
            while (right > left && a[right]>=pivot){
                right--;
            }
            // if a lesser value is not found 
            //  then exit.
            if(left==right) 
                break;
                
            // move a value smaller than pivot 
            // to left of pivot.
            a[left] = a[right];
            left++;
            // search from the left for a value 
            //   larger than pivot.
            while (right > left && a[left] <= pivot){
                left++;
            }
            // if a larger value is not found 
            //   then exit.
            if(left == right) break;
            // move the value larger than pivot 
            //   to the right of the pivot. 
            a[right]=a[left];
            right--;
        }
        // the pivot is moved to a position 
        //   separating left and right.
        a[right]=pivot;
        // apply quicksort to the sublists.
        quicksort(a, start,   right-1);
        quicksort(a, right+1, end    );
    }
}