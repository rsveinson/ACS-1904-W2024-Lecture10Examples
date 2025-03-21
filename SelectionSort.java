import java.util.Arrays;
import javax.swing.*;
public class SelectionSort
{
    public static void main(String[] args){
        int[] toSort = {5, 3, 2, 1, 14, 8, 5};
        
        System.out.println(Arrays.toString(toSort));
        selectionSort(toSort);
        System.out.println(Arrays.toString(toSort));
        
        System.out.println("end of program");
    }
    
    public static void selectionSort(int[] a){
        int n = a.length;
        
        // n-1 passes of the unsorted sublist
        for (int i=0; i<n-1; i++) {
            // find the index of the smallest element in the unsorted sublist
            int iSmallest = i;
            
            // test against successive elements
            for (int j=i+1; j<n; j++) {
                // update the index of the smallest
                if (a[j] < a[iSmallest]) {
                    // found new smallest
                    iSmallest = j;
                }
            }//end for j
            
            // swap the smallest element with the start of the unsorted sublist 
            /* as an exercise you can create a statice method
             * or even a Class to swap 2 array elements
             * with this sub-program you can call swap() instead of repeating this code
             */
            if(iSmallest != i) {
                int temp = a[i];
                a[i] = a[iSmallest];
                a[iSmallest] = temp;
            }
            
            /* the following is included to show how the
             * sorted sub-list grows with each pass
             */
            JOptionPane.showMessageDialog(null, Arrays.toString(a));
            System.out.println(Arrays.toString(a));
            
        }// end for i
    }
}