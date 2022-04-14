import java.util.ArrayList;
import java.util.Scanner;
// import java.util.SortedSet;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<int[]> arrayList = new ArrayList<>();

        while(n--!=0){
            int [] arr = new int[3];
            for(int i = 0; i < arr.length; i++){
                arr[i] = scanner.nextInt();
            }
            arrayList.add(arr);
        }

        int vx = 0 , vy = 0, vz = 0;
        for(int i = 0; i < arrayList.size(); i++){
            int [] arr  = arrayList.get(i);
             vx += arr[0];
             vz += arr[1];
             vy += arr[2];
        }


        if(vx==0&&vy==0&&vz==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }



    }
}
