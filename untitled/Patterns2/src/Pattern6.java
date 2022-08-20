import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        int k = 0;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= i + k) {
                System.out.print("*");
                j++;
            }
            k++;
            // j = 1;
            // while(j<=i-1){
            //     System.out.print("*");
            //     j++;
            // }
            System.out.println();
            i++;
        }
    }
}