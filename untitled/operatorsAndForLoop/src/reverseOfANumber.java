import java.util.Scanner;
public class reverseOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0;
        for(int i=0; n!=0; i++){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        System.out.print(ans);
    }
}
