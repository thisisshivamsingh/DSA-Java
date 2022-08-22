import java.util.Scanner;
public class termsOfAp {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int p = 0;
        int j = 1;
        int i = 1;
            while(i<=c) {
                p = 3 * j + 2;
                if (p % 4 != 0) {
                    System.out.print(p+" ");
                    i++;
                }
                j++;
            }

    }
}

