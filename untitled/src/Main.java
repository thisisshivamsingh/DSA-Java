import java.util.*;
public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello World");
//        System.out.print("Hello World\n");
//        System.out.print("Hello World");

//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");

//        System.out.print("*\n**\n***\n****\n*****\n");

//        System.out.print("*****\n   * \n  *  \n *   \n*****");

//        System.out.println("*****");
//        System.out.println("   *");
//        System.out.println("  *");
//        System.out.println(" *");
//        System.out.println("*****");

//        int x = 15;
//        int y = 10;
//        int sum = x + y;
//        System.out.println(sum);
//        System.out.println("Sum of "+ x +" and "+ y +" is "+ sum);

        //xy
//        int prd = x * y;
//        System.out.println("Product of "+ x +" and "+ y +" is "+ prd);
        // x / y, y / x, x % y
//        int v1 = x / y;
//        int v2 = y / x;
//        int v3 = x % y;
//        System.out.println(v1);
//        System.out.println(v2);
//        System.out.println(v3);

        // exp
//        int exp =  x * y  /  x + y ;
//        int exp = ( x * y ) / ( x + y );
//        System.out.println(exp);

//        int x = 11;
//        if(x%2==0){
//            System.out.println(x + " is even.");
//        }else{
//            System.out.println(x + " is odd.");
//        }
//        System.out.println("Hardwork is better than smart work");
//        int n1 = 20;
//        int n2 = 30;

//        if(n1==n2){
//            System.out.println(n1 + " is equal to " + n2);
//        }else{
//            if(n1>n2){
//                System.out.println(n1 + " is greater than " + n2);
//            }else{
//                System.out.println(n1 + " is smaller than " + n2);
//            }
//        }

//        if(n1==n2){
//            System.out.println(n1 + " is equal to " + n2);
//        }else if(n1>n2){
//            System.out.println(n1 + " is greater than " + n2);
//        }else{
//            System.out.println(n1 + " is smaller than " + n2);
//        }

//        int marks = 100;
//
//        if(marks>90){
//            System.out.println("excellent");
//        }else if(marks>80&&marks<=90){
//            System.out.println("good");
//        }else if(marks>70&&marks<=80){
//            System.out.println("fair");
//        }else if(marks>60&&marks<=70){
//            System.out.println("meets expectations");
//        }else if(marks<=60){
//            System.out.println("below par");
//        }

//        int i = 1;

//        while(i<=9){
//            System.out.println(i);
////            i = i + 1;
//            i++;
//        }

//        for(int i = 1; i<=9; i++){
//            System.out.println(i);
//        }
//        System.out.println("Done.");

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        for(int i = 0; i <= n; i++){
//            System.out.println(i);
//    }
//        String name = scn.nextLine();
//        System.out.println("Hello "+ name);

//        int n = Integer.parseInt(scn.nextLine());
////        int n = scn.nextInt();
//        String name = scn.nextLine();
//
//        System.out.println("Dear " + name + ". Here is the counting ");
//        for(int i=0; i<=n; i++){
//            System.out.println(i);
//        }

        ///// MY PRIME NUMBER APPROACH /////
//        int t = scn.nextInt();
//        int n = scn.nextInt();
//        Boolean a = true;
//        for(int i = 1; i <= t; i++){
//            while(a&&n<=i) {
//                if(i%n==0){
//                    System.out.println("Not Prime");
//                    a= false;
//            }else{
//                    System.out.println("Prime");
//                    a= false;
//                }
//                i++;
//
//        }
//            a=true;
//        }

        ///// SUMIT SIR PRIME NUMBER APPROACH /////
//        Scanner scn = new Scanner(System.in);
//        int t = scn.nextInt();
//
//        for(int i=0; i<t; i++){
//            int n = scn.nextInt();
//
//            int count = 0;
//            for(int div =1; div<=n; div++){
//                if(n%div==0){
//                    count++;
//                }
//            }if(count==2){
//                System.out.println("prime");
//            }else{
//                System.out.println("not prime");
//            }

//        int t = scn.nextInt();
//
//        for(int i=0; i<t; i++){
//            int n = scn.nextInt();
//
//            int count = 0;
//            for(int div =2; div * div <= n; div++){
//                if(n%div==0){
//                    count++;
//                    break;
//                }
//            }if(count==0){
//                System.out.println("prime");
//            }else{
//                System.out.println("not prime");
//            }
//        }

//      int f = scn.nextInt();
//      int l = scn.nextInt();
//
//      for (int i = f; i<l; i++){
//          int count = 0;
//          for(int div=2;div<l;div++){
//              if(i%div==0){
//                  count++;
//              }
//          }if (count>1){
//              System.out.println("not prime");
//          }else{
//              System.out.println("prime");
//          }
//      }


//    int low = scn.nextInt();
//    int high = scn.nextInt();
//
//      for (int n = low; n<=high; n++){
//        int count = 0;
//
//        // try to divide n and inertease count
//        for(int div=2;div*div<=n;div++){
//        if(n%div==0){
//        count++;
//        break;
//        }
//        }
//        // try to divide n and inertease count
//
//        if (count==0){
//        System.out.println(n);
//        }
//        }

//       int input = scn.nextInt();
//int a = 0;
//int b = 1;
//       if(input==a){
//           System.out.println(0);
//       } else if (input==b) {
//           System.out.println(0);
//           System.out.println(1);
//       }else{
//           System.out.println(a);
//           System.out.println(b);
//           for(int i=1;i<=(input-2);i++){
//               int c= a+b;
//               System.out.println(c);
//               a=b;
//               b=c;
//           }
//       }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int a = 0;
//        int b = 1;
//
//        for(int i=0; i<n; i++){
//            System.out.println(a);
//            int c = a + b;
//            a=b;
//            b=c;
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int dig = 0;
//        while(n!=0){
//             n=n/10;
//             dig++;
//        }
//        System.out.println(dig);

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int nod = 0;
//        int temp = n;
//        while (temp!=0){
//            temp=temp/10;
//            nod ++;
//        }
//        int div=(int)Math.pow(10, nod-1);
//        while(div !=0){
//            int q = n/div;
//            System.out.println(q);
//
//            n=n%div;
//            div=div/10;
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        while(n>0){
//            int dig = n % 10;
//            n=n/10;
//            System.out.println(dig);
//        }

//Scanner scn = new Scanner(System.in);
//int n = scn.nextInt();
//
//int inv = 0;
//int op = 1;
//while(n!=0){
//    int od = n % 10;
//    int id = op;
//    int ip = od;
//
//    // make change to inv using ip and id
//    inv = inv+id*(int)Math.pow(10,ip-1);
//
//    n=n/10;
//    op++;
//}
//System.out.println(inv);

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int k = scn.nextInt();
//
//        int temp = n;
//        int nod = 0;
//        while (temp>0){
//            temp=temp/10;
//            nod ++;
//        }
//
//        k = k % nod;
//        if(k<0){
//            k=k+nod;
//        }
//
//            int div = 1;
//            int mult = 1;
//            for(int i = 1; i<=nod;i++){
//                if(i<=k){
//                    div=div*10;
//                }else {
//                    mult=mult*10;
//                }
//            }
//            int q = n/div;
//            int r = n%div;
//
//             int rot = r * mult + q;
//             System.out.println(rot);

//        Scanner scn = new Scanner(System.in);
//        int n1 = scn.nextInt();
//        int n2 = scn.nextInt();
//
//        int on1 = n1;
//        int on2 = n2;
//
//        while(n1%n2!=0){
//             int rem = n1%n2;
//             n1=n2;
//             n2=rem;
//        }
//
//        int gcd = n2;
//        int lcm = (on1*on2)/gcd;
//
//        System.out.println(gcd);
//        System.out.println(lcm);

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int i =2;
//        while(n>1){
//
//            if(n%i==0){
//                n=n/i;
//                System.out.println(i);
//            } else  {
//                i++;
//            }
//
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        for(int div=2; div*div<=n;div++){
//            while(n%div==0){
//                n=n/div;
//                System.out.print(div +" ");
//            }
//        }
//        if(n!=1){
//            System.out.print(n);
//        }

//        Scanner scn = new Scanner(System.in);
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//        int c = scn.nextInt();
//
//        if(a*a+b*b==c*c){
//            System.out.println(true);
//        } else if (a*a+c*c==b*b) {
//            System.out.println(true);
//        } else if (b*b+c*c==a*a) {
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        Scanner scn = new Scanner(System.in);
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//        int c = scn.nextInt();
//
//        int max=a;
//        if(b>=max){
//            max=b;
//        }
//        if(c>=max){
//            max=c;
//        }
//        if(max==a){
//            boolean flag = ((b*b+c*c)==(a*a));
//            System.out.println(flag);
//        }else if(max==b){
//            boolean flag = ((a*a+c*c)==(b*b));
//            System.out.println(flag);
//        }else{
//            boolean flag = ((b*b+a*a)==(c*c));
//            System.out.println(flag);
//        }

//        Scanner scn = new Scanner (System.in);
//        int n =scn.nextInt();
//
//        for(int i=1; i*i<=n;i++){
//            System.out.println(i*i);
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        String star = "";
//
//        for(int i=1;i<=n;i++){
//            star="";
//            for(int j=1;j<=i;j++){
//                star=star+"*";
//            }
//            System.out.println(star);
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

//        Scanner scn = new Scanner(System.in);
//        int on = scn.nextInt();
//        int n = on;
//        String star="";
//
//        for(int i=1;i<=on;i++){
//            star ="";
//            for(int j=1;j<=n;j++){
//            star=star+"*";
//            }
//            System.out.println(star);
//            n--;
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int on = n;
//        String spc = "";
//        String row="";
//        for(int i=1;i<=n;i++){
//            row="";
//            on--;
//            spc="";
//            for(int k=n;k<=(on-1);k--){
//                spc=spc+" ";
//            }
//        for (int j = 1; j<=i;j++){
//            row=row+"*\t";
//        }
//            System.out.print(spc+row);
//            System.out.println();
//        }

        // Unsolved //
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int sp = n-1;
//        int st = 1;
//        for(int i=1; i<=n; i++){
////            System.out.print(sp+", "+st);
//            for(int j=1; j<=sp; j++){
//                System.out.print("\t");
//            }
//            for(int j=1; j<=st; j++){
//                System.out.print("*\t");
//            }
//            sp--;
//            st++;
//            System.out.println();
//        }

// Unsolved //
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int sp =0;
//        int st =n;
//        for (int i =1;i<=n;i++){
//            for(int j=1; j<=sp; j++){
//                System.out.print("\t");
//            }
//            for(int j=1; j<=st;j++){
//                System.out.print("*\t");
//            }
//            sp++;
//            st--;
//            System.out.println();
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int sp = n/2;
//        int st = 1;
//        for (int i=1; i<=n; i++ ){
////            System.out.println(sp+", "+st);
//            for(int j=1; j<=sp; j++){
//                System.out.print("\t");
//            }
//            for(int j=1; j<=st; j++){
//                System.out.print("*\t");
//            }
//            if(i<=n/2){
//                sp--;
//                st+=2;
//            }else{
//                sp++;
//                st-=2;
//            }
//            System.out.println();
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int st = n/2+1;
//        int sp = 1;
//        for (int i=1; i<=n;i++){
//            for(int j =1; j<=st;j++){
//                System.out.print("*\t");
//            }
//            for(int j=1;j<=sp;j++){
//                System.out.print("\t");
//            }
//            for(int j=1;j<=st;j++){
//                System.out.print("*\t");
//            }
//            if(i<=n/2){
//                st--;
//                sp+=2;
//            }else{
//                st++;
//                sp-=2;
//            }
//            System.out.println();
//        }

        ///// BASIC PATTERN /////

        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j =1;
            while(j<=n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
        }

