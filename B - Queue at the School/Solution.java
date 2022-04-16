import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String str = scanner.next();
        char [] arr  = str.toCharArray();

        while(t--!=0){

            for(int i = 1; i < n ;++i){

                if(arr[i-1]=='B'&arr[i]=='G'){
                    arr[i-1] ='G';
                    arr[i] = 'B';
                    ++i;
                }
            }
        }


        for(char ch : arr){
            System.out.print(ch);
        }
        System.out.println();
        scanner.close();


    }
}