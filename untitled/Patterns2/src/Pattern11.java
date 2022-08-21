import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            System.out.print(1);
            int j = 2;
            while(j<=i){
                System.out.print("+");
                System.out.print(j);
                j++;
            }
            j=1;
            while(j<=i){
                sum = sum + j;
                j++;
            }
            System.out.print("="+sum);
            System.out.println();
            sum=0;
            i++;
        }
    }
}
