import java.io.*;
import java.util.*;
public class rotateAnArray {
    public static void main(String[] args) throws Exception {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
         arr[i]=scn.nextInt();
        }
        rotate(arr,k);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void rotate(int [] a, int k){
        k = k % a.length;
        if(k < 0){
            k = k + a.length;
        }
        // Part 1
        reverse(a, 0, a.length-k-1);

        // Part 2
        reverse(a, a.length-k, a.length-1);

        // all
        reverse(a, 0, a.length-1);
    }
    public static void reverse(int [] a, int i, int j){
        int li = i;
        int ri = j;

        while(li < ri){
            int temp = a [li];
            a[li] = a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }
}
