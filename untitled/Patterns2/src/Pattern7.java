import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;

        while(i<=n){
            int spaces = 1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            int p = i;
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
            }
            int k = i-1;
            j=1;
            while(j<=i-1){
                System.out.print(k+i-1);
                k--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
