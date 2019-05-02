import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        if (isPalindrome(s)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    private static boolean isPalindrome(String s){
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (char ch : s.toLowerCase().toCharArray() ){
            if (ch == ' ' || ch ==','){
                continue;
            }
            charFrequencies.merge(ch, 1, Integer::sum);
        }
        int oddFreq = 0;
        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet())
            if (entry.getValue() % 2 != 0) {
                oddFreq++;
            }
        return oddFreq <= 1;

    }
}
