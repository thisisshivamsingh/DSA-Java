import java.util.Scanner;
public class Pattern10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            char startingChar = (char)('A'+i-1);
            while(j<=i){
                System.out.print(startingChar);
                j++;
            }
            System.out.println();
            i++;
        }

    }

}
