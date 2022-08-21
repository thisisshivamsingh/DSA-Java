import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        int max = n * 2 - 1;
        while (i <= n) {
            int j = 1;
            int sum = (2 * i) - 1;
            while (j <= n) {
                System.out.print(sum);
                sum += 2;
                if (sum > max) {
                    sum = 1;
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}