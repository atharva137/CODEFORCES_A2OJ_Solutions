import java.util.Scanner;

public class A_Beautiful_Year {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int  n = scanner.nextInt();

        while(true){
            n++;
            int a  = (n%10);
            int b  = (n/10)%10;
            int c  = (n/100)%10;
            int d =  (n/1000)%10;

           if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d){
               break;
           }
        }

        System.out.println(n);
        scanner.close();
    }
}
