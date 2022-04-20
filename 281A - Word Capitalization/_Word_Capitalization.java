import java.util.Scanner;

public class _Word_Capitalization {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        StringBuilder sb = new StringBuilder();

        String s1 = str.substring(0,1).toUpperCase();

        sb.append(s1);
        sb.append(str.substring(1));

        System.out.println(sb.toString());

        scanner.close();
    }
}