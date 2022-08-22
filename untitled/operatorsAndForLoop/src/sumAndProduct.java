import java.util.Scanner;
public class sumAndProduct {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i<=n; i++){
            if(c==1){
                sum=sum+i;
            }else if(c==1){
                product=product*i;
            }
        }
        if(c==1){
            System.out.print(sum);
        }else if(c==2){
            System.out.print(product);
        }else{
            System.out.print("-1");
        }
    }
}
