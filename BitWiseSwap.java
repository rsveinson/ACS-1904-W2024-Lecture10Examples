import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class BitWiseSwap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int[] list = {-5, -10};
        
        // printList(list, list.length);
        // swap(list, 0, 1);                   // swap values at idices 0 and 1
        // printList(list, list.length);
        
        int n = 5;
        int m = 10;
        
        System.out.println(n + " " + m);
        System.out.println(Integer.toBinaryString(n) + " " + Integer.toBinaryString(m));
        
        n = n ^ m;
        System.out.println(n + " " + m);
        System.out.println(Integer.toBinaryString(n) + " " + Integer.toBinaryString(m));
        
        m = n ^ m;
        System.out.println(n + " " + m);
        System.out.println(Integer.toBinaryString(n) + " " + Integer.toBinaryString(m));
        
        n = n ^ m;
        System.out.println(n + " " + m);
        System.out.println(Integer.toBinaryString(n) + " " + Integer.toBinaryString(m));


        System.out.println("end of program");
    }
    
    public static void swap(int[] l, int i, int j){
        int temp = l[i];
        //  i = j;
        //  j = i;

        System.out.println(l[i] + " " + l[j]);
        
        // swap the conventional way
        // l[i] = l[j];
        // l[j] = temp;
        
        // bit wise xor cooler
        l[i] = l[i] ^ l[j];
        l[j] = l[i] ^ l[j];
        l[i] = l[i] ^ l[j];
        
        System.out.println(l[i] + " " + l[j]);
    } // end swap
    
    public static void printList(int[] l, int len){
        for(int i = 0; i < len; i++)
            System.out.println(i + ": " + l[i]);
    }// end printList
}
