import java.util.Arrays;
import javax.swing.*;
import java.util.Random;

public class InsertionSort
{
    public static void main(String[] args){
        int[] l = new int[10];
        int[] list = {5, 3, 2, 1, 14, 8, 5};
        
        // System.out.println(Arrays.toString(list));
        // insertionSort(list);
        // System.out.println(Arrays.toString(list));
        
        loadList(l);
        System.out.println(Arrays.toString(l));
        insertionSort(l);
        System.out.println(Arrays.toString(l));
        
        System.out.println("end of program");
    }
    
    public static void insertionSort(int[] a){
        int n = a.length;
        // initially sorted list is a[0]
        // initially unsorted list is a[1], a[2], ...
        // i is index of first element in the unsorted list
        for (int i = 1; i < n; i++) {
            // x is the element to be placed in its proper position within the sorted list
            int x = a[i];  // get the number to be placed
            
            // shift elements to the right to find the position for x
            int j = i - 1;  // reference the last number of the sorted sub-list
            
            /*shift array elements
             * as long as the number to be placed is 
             * less than or equal to the current element
             * of the sorted sub-list
             */
            while (j >= 0 && a[j] > x){  
                a[j+1] = a[j];      // shift sorted sub-list value on index right
                j--;  // move one index left in the sorted sub-list
            }
            /* all of the numbers have been shifted
             * we can place the number to be placed
             * into its position in the sorted
             * sub-list
             */
            a[++j] = x; 
            
            // look at the intermediate sorted and un-sorted sub-lists
            System.out.println(Arrays.toString(a));  
        }
        
    }
    
    public static void loadList(int[] l){
        Random rnd = new Random();
        
        for(int i = 0; i < l.length; i++){
            l[i] = rnd.nextInt(15) + 1;
        }// end for i
    }// end load list
    
    public static void printList(int[] l){
        
        for(int i = 0; i < l.length; i++){
            System.out.println(l[i]);
        }// end for i
    }// end load list
}