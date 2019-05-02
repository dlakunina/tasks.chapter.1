import java.util.Scanner;

public class Solution {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        boolean result = isAnagram(s1,s2);
        System.out.println((result) ? "Anagrams" : "Not Anagrams");
    }
    private static boolean isAnagram(String s1, String s2){
        for (char c = 'a'; c<='z'; c++){
            if (count(s1, c) != count(s2, c)){
                return false;
            }
        }
        return true;
    }
    private static int count (String s, char c){
        char[] sArr = s.toLowerCase().toCharArray();
        int numLet = 0;
        for (char let : sArr){
            if (let == c){
                numLet++;
            }
        }
        return numLet;
    }
}
