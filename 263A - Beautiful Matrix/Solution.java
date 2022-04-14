import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] mat = new int [6][6];

        int oi = -1, oj = -1;
        for(int i = 1; i<= mat.length-1; i++){
            for(int j = 1; j<= mat.length-1; j++){

                mat[i][j] = scanner.nextInt();

                if(mat[i][j]==1){
                    oi = i;
                    oj = j;
                }
            }
        }
        int minSteps = 0;
        while(oi!=3||oj!=3){

            if(oi>3){
                oi --;
                minSteps++;
            }else if (oi<3){
                oi++;
                minSteps++;
            }

            if(oj>3){
                oj --;
                minSteps++;
            }else if(oj<3){
                oj++;
                minSteps++;
            }

        }

        System.out.println(minSteps);
        scanner.close();
    }
}
