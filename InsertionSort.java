import java.util.Arrays;
import javax.swing.*;
import java.util.Random;

public class InsertionSort
{
    public static void main(String[] args){
        int[] l = new int[15];
        int[] list = {5, 3, 2, 1, 14, 8, 5};
        
        System.out.println(Arrays.toString(list));
        insertionSort(list);
        System.out.println(Arrays.toString(list));
        
        System.out.println("end of program");
    }
    
    public static void insertionSort(int[] a){
        int n = a.length;
        // initially sorted list is a[0]
        // initially unsorted list is a[1], a[2], ...
        // i is index of first element in the unsorted list
        for (int i=1; i<n; i++) {
            // x is the element to be placed in its proper position within the sorted list
            int x = a[i];
            
            // shift elements to the right to find the position for x
            int j=i-1;
            
            //shift array elements
            while (j>=0 && a[j]>x){
                a[j+1] = a[j];
                j--;
            }
            a[++j]=x;
            JOptionPane.showMessageDialog(null, Arrays.toString(a));
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