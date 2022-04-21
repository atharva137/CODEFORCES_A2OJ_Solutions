
import java.util.Scanner;

public class _Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();

        int cnt = 0;
        for(int i = 1; i < n; i++){
            if(str.charAt(i-1)==str.charAt(i)) cnt++;
        }

        System.out.println(cnt);

        scanner.close();
    }
}
