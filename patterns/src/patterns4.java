import java.util.Scanner;
public class patterns4 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int l = n;
    for(int i = 0; i < n; i++){
        for (int k = 1; k <= n-l; k++){
            System.out.print(" ");
        }
        for(int j = 1; j <= n-i; j++){
            System.out.print("*");
        }
        System.out.println();
        l--;
    }
}
}
