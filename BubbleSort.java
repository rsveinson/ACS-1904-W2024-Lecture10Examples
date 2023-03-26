import java.util.Arrays;
import javax.swing.*;
public class BubbleSort
{
    public static void main(String[] args){
        int[] list = {5, 3, 2, 1, 14, 8, 5};
        System.out.println(Arrays.toString(list));
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void bubbleSort(int[] a){
        int n = a.length;
        // initially sorted list is empty
        // initially unsorted list is a[0], a[1], a[2], ...
        // i is index of first element in the unsorted list
        for (int i=0; i<n-1; i++) {
            // scan the unsorted sublist to bubble the largest to the end
            for (int j=0; j<n-i-1; j++){
                if (a[j] > a[j+1]) {
                    // pair is out of order so swap them
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            JOptionPane.showMessageDialog(null, Arrays.toString(a));
        }
    }
}