import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String test = sc.nextLine();
        if (hasNoSimChar(test)){
            System.out.println("No similar characters");

        }
        else{
        System.out.println("Contains similar characters");
        }
    }

    private static boolean hasNoSimChar(String s){
        char[] testLineArr = s.toLowerCase().toCharArray();
        Arrays.sort(testLineArr);
        boolean result = false;
        int arrLength = testLineArr.length;
        for (int i = 0; i < arrLength-1; i++){
            if (testLineArr[i] == testLineArr[i+1]){
                result = false;

            }
            else result = true;
        }
        return result;
    }

}
