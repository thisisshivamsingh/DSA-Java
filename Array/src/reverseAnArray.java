import java.io.*;
import java.util.*;
public class reverseAnArray {
    public static void main(String[] args) throws Exception {
        // Write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i]=scn.nextInt();
        }
        int j = 1;
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            k = arr[arr.length - j];
            System.out.println(k);
            j++;
        }
//////////////////////////////////////////////////////////////


//    public static int reverse(int[] a) {
//        // write your code here
//        int i = 0;
//        int j = a.length - 1;
//
//        while (i < j) {
//            int temp = a[i];
//            a[i] = a[j];
//            a[j] = temp;
//
//            i++;
//            j--;
//        }
//    }


    }
}