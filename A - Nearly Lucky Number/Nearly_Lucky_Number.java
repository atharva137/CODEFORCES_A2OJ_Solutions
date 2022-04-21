import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

         long cnt = 0;
        while(n!=0){

            long  dig  =   n % 10;
            if (dig == 4 || dig ==7) {
                cnt++;
            }
            n = n/10;
        }

          if(cnt==7||cnt==4) System.out.println("YES");else System.out.println("NO");
         scanner.close();
    }
}
