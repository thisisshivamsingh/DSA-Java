import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("*");
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j<=1){
                System.out.print("*");
                j++;
            }
             j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            j = 1;
            while(j < i){
                System.out.print(i-j);
                j++;
            }
            System.out.println("*");
            i++;
        }
        i=n;
        while(i>1){
            int j = 1;
            while(j<=1){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j<i){
                System.out.print(j);
                j++;
            }
            j=1;
            while(j<i-1){
                System.out.print(i-j-1);
                j++;
            }
            System.out.println("*");
            i--;
        }
        System.out.println("*");
    }
}
