import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[3][3];
        int [][] op = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = 1;
                op[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                if(op[i][j]==0) {continue;}
                if (op[i][j]%2==0) {continue;}
                else {
                     arr[i][j] = 1 - arr[i][j];
                    if((i+1)<3){
                        arr[i+1][j] = 1 - arr[i+1][j];
                    }
                    if((j+1)<3){
                        arr[i][j+1] = 1 - arr[i][j+1];
                    }
                    if((i-1)>=0){
                        arr[i-1][j] = 1 - arr[i-1][j];
                    }
                    if((j-1)>=0){
                        arr[i][j-1] = 1 - arr[i][j-1];
                    }

                }
            }
        }

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
          scanner.close();
    }


}
