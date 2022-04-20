import java.util.Scanner;

public class _Word {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

         int cntL = 0;
        for (int i = 0; i < str.length(); i++){
              if(Character.isLowerCase(str.charAt(i))){
                  cntL++;
              }
        }

        int  x = str.length() - cntL;

        if(x<=cntL){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }

        scanner.close();

    }

}
