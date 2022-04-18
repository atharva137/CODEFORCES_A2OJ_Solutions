import java.util.HashMap;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put(".",0);
        hashMap.put("-.",1);
        hashMap.put("--",2);

        String subStr  = "";
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='.'){
                subStr = str.substring(i,i+1);
            }else if (str.charAt(i)=='-'){
                subStr = str.substring(i,i+2);
                i++;
            }

            ans.append(hashMap.get(subStr));
        }

        System.out.println(ans.toString());

        scanner.close();
    }
}
