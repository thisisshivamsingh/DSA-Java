import java.io.*;
import java.util.*;
public class inverseOfAnArray {
    public static void main(String[] args) throws Exception {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }

        int [] newArr = inverse(arr);

        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
//        int [] newArr = new int[n];
//
//        for(int i=0; i<newArr.length; i++){
//             newArr[arr[i]]=i;
//        }
//
//        for(int i=0; i<newArr.length; i++){
//            System.out.println(newArr[i]);
//        }
    }
    public static int [] inverse(int [] a){
        int [] inv = new int[a.length];

        for(int i = 0; i < a.length; i++){
            int v = a[i];
            inv[v] = i;
        }
        return inv;
    }
}
